package net.iskandar.olms;

import net.iskandar.olms.server.domain.User;
import net.iskandar.olms.server.domain.folder.Folder;
import net.iskandar.olms.server.domain.folder.FolderItem;
import net.iskandar.olms.server.domain.folder.UserFolderItem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    public static Session getSession(){
    	return sessionFactory.getCurrentSession();
    }

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	File userHome = new File(System.getProperty("user.home"));
        	File configFile = new File(userHome, "hibernate.cfg.xml");
        	if(configFile.exists())
        		System.out.println(configFile);
        	Configuration configuration = new Configuration();
        	configuration.configure(configFile);
        	configuration.addAnnotatedClass(Folder.class);
        	configuration.addAnnotatedClass(User.class);
        	configuration.addAnnotatedClass(FolderItem.class);
        	configuration.addAnnotatedClass(UserFolderItem.class);
        	return configuration.buildSessionFactory(
    			    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
            // return new Configuration().configure();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}