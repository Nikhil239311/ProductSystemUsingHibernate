package ProjectProduct;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class PricePrintUptoRange {

	public static void main(String[] args) {
		Session session = MyConfig.getSession(); // Get session
        session.beginTransaction().commit();; // Start transaction

        String query = "FROM Product WHERE price BETWEEN 10 AND 15";
        Query<Product> queryRes = session.createQuery(query, Product.class);
        
        List<Product> plist = queryRes.list(); // Execute query
        
       if(plist.isEmpty()) {
    	   System.out.println("DATA NOT FOUND ");
       }else {
    	   for (Product product : plist) {
			System.out.println(product);
		}
       }

	}
}
