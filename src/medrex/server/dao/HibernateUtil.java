package medrex.server.dao;

import medrex.server.constants.Global;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			if (Global.reset) {
				sessionFactory = new AnnotationConfiguration().configure(
						"hibernate2.cfg.xml").buildSessionFactory();
			} else {
				sessionFactory = new AnnotationConfiguration().configure(
						"hibernate.cfg.xml").buildSessionFactory();
			}
		} catch (Exception ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void initTutorial() {
		sessionFactory = new AnnotationConfiguration().configure(
				"hibernateTutorial.cfg.xml").buildSessionFactory();
	}

	public static void resetSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			if (Global.reset) {
				sessionFactory = new AnnotationConfiguration().configure(
						"hibernate2.cfg.xml").buildSessionFactory();
			} else {
				sessionFactory = new AnnotationConfiguration().configure(
						"hibernate.cfg.xml").buildSessionFactory();
			}
		} catch (Exception ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

}
