package ProjectProduct;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class InsertProduct {

	public static void main(String[] args) {

		Session session = MyConfig.getSession();
		System.out.println("connection success ");

		// Inserting the product details
		Product product = new Product(134, "bread", 80, 10, "23/3/25", "23/4/25");

		Criteria criteriaRes = session.createCriteria(Product.class); // select *
		List<Product> pList = criteriaRes.list();

		boolean checkExistId = false;
		for (Product pp : pList) {
			if (product.id == pp.id) {
				checkExistId = true;
			}
		}

		if (checkExistId == false) {
			session.save(product);
			session.beginTransaction().commit();
			System.out.println(product + "\n is Inserted..");
		} else {
			System.out.println(product + " \nAllready Exists");
			// want to change id for same entry..
		}

		// return productId + " \nAllready Exists" ;

	}
}
