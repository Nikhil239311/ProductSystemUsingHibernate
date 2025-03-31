package ProjectProduct;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class FoundByProductName {

	public static void main(String[] args) {

		Session session = MyConfig.getSession();
		String query = "FROM Product WHERE name = :name";
		Query<Product> queryproduct = session.createQuery(query, Product.class);
		queryproduct.setParameter("name", "bread");
		List<Product> plist = queryproduct.list();
		
		if (plist.isEmpty()) {
			System.out.println("Data not found ");
		} else {
			for (Product product : plist) {
				System.out.println("\n" + product);
			}
		}
	}
}