package ProjectProduct;

import org.hibernate.Session;

public class UpdateProduct {
	

	public static void main(String[] args) {
		Product product=new Product(10, "milk", 90, 50, "19/2/25", "20/5/25");
		
			Session session =MyConfig.getSession();
		
			session.saveOrUpdate(product);
			session.beginTransaction().commit();
			System.out.println("Data Updated ");
			
	}
}
