package ProjectProduct;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class GetAllProductDetails {

	public static void main(String[] args) {
		Session session = MyConfig.getSession();


		Criteria criteriaRes = session.createCriteria(Product.class); // select *

		List<Product> pList = criteriaRes.list();

		for (Product pp : pList) {

				System.out.println(pp);
			}
		}
	}


