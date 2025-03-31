package ProjectProduct;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class PrintMaxPrice {

	public static void main(String[] args) {
		
		Session session=MyConfig.getSession();
		session.beginTransaction().commit();
		
		String query=" FROM Product WHERE price = (SELECT MAX(price) FROM Product)";
		Query<Product> RsQuery = session.createQuery(query,Product.class);
		
		List<Product> plist = RsQuery.list();
		
		if(plist.isEmpty()) {
			System.out.println("DATA NOT FOUND ");
		}else {
			for (Product product : plist) {
				System.out.println(product);
			}
		}
//		
		session.close();
	}
}
