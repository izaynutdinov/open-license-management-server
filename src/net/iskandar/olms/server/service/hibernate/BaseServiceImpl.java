package net.iskandar.olms.server.service.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.iskandar.olms.server.domain.BaseEntity;
import net.iskandar.olms.server.service.Service;

public class BaseServiceImpl<T> implements Service<T> {

	private Class clazz;
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public BaseServiceImpl(Class clazz) {
		super();
		this.clazz = clazz;
	}

	@Override
	public T get(Integer id) {
		return (T) getSession().get(clazz, id);
	}

}
