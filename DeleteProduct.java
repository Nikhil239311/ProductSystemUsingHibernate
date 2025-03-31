package ProjectProduct;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

public class DeleteProduct {
	public static void main(String[] args) {
		Session session = MyConfig.getSession();

		Transaction t = session.beginTransaction();
		int pid = 134;
		Product p = session.get(Product.class, pid);
//		System.out.println(p);//return null
		if (p != null) {
			session.delete(p);
			t.commit();
			System.out.println("Product deleted \n " + p);
		} else {
			System.out.println("Product already deleted \n " + p);
			t.rollback();
		}
		session.close();
	}

}
