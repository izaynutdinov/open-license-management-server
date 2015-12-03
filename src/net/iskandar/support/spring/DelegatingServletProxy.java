package net.iskandar.support.spring;

import java.io.IOException;
import static java.lang.System.out;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Copy paste implementation based on class from forest project
 * Improvements:
 *   1. Use servlet name as a bean name if "targetBean" init parameter is not set  
 * @author iskandar
 *
 */
public class DelegatingServletProxy implements Servlet {

    private static final String TARGET_BEAN = "targetBean";
	private Servlet delegate;

    protected ApplicationContext getContext(ServletContext servletContext) {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
    }

    public void init(final ServletConfig servletConfig) throws ServletException {
        String targetBean = servletConfig.getInitParameter(TARGET_BEAN);
        if(targetBean == null){
        	targetBean = servletConfig.getServletName();
        }
        final ApplicationContext ctx = getContext(servletConfig.getServletContext());

        if (targetBean == null || !ctx.containsBean(targetBean)) {
            throw new ServletException("targetBean '" + targetBean + "' not found in context.");
        }

        this.delegate = (Servlet) ctx.getBean(targetBean, Servlet.class);
        this.delegate.init(servletConfig);
    }

    public ServletConfig getServletConfig() {
        return this.delegate.getServletConfig();
    }

    public void service(final ServletRequest servletRequest,
                        final ServletResponse servletResponse) throws ServletException,
            IOException {
    	out.println("DelegatingServletProxy.service");    	
        this.delegate.service(servletRequest, servletResponse);
    }

    public String getServletInfo() {
        return this.delegate.getServletInfo();
    }

    public void destroy() {
        if (this.delegate != null) {
            this.delegate.destroy();
            this.delegate = null;
        }
    }

}
