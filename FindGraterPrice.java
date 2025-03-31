package ProjectProduct;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class FindGraterPrice {

	public static void main(String[] args) {

		Session session = MyConfig.getSession();
		Criteria criteria = session.createCriteria(Product.class);
		criteria.add(Restrictions.gt("price", 40.0 ));
		List<Product> plist = criteria.list();

		if (plist.isEmpty()) {
			System.out.println("DATA NOT FOUND ");
		} else {
			for (Product product : plist) {
				System.out.println(product);
			}
		}
		session.close();

	}

}
