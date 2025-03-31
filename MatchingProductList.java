package ProjectProduct;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class MatchingProductList {

	public static void main(String[] args) {
		Session session=MyConfig.getSession();
		Criteria criteria = session.createCriteria(Product.class);
		criteria.add(Restrictions.like("name", "b%"));
		List<Product> plist = criteria.list();
	
		for (Product product : plist) {
			System.out.println(product);
		}
	
	}
}
