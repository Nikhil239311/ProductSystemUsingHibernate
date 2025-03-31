package ProjectProduct;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class AllDataPrint {

	public static void main(String[] args) {
		
		Session session=MyConfig.getSession();
		
		Criteria criteriares = session.createCriteria(Product.class);
		
		List<Product> plist = criteriares.list();
		
		for (Product product : plist) {
			if(product!=null) {
				System.out.println(product);
				
			}else {
				System.out.println("DATA BASE EMPTY ");
			}
			
		}
	}
}
