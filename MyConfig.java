package ProjectProduct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyConfig {

	public static Session getSession() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

}
