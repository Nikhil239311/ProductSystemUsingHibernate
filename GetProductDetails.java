package ProjectProduct;

import org.hibernate.Session;

public class GetProductDetails {

	public static void main(String[] args) {
		Session session=MyConfig.getSession();
		
		Product p=session.get(Product.class, 5);
		if(p!=null) {
			
			System.out.println(p);
		}else {
			System.out.println("Data not found ");
		}
		
	}
	
}
