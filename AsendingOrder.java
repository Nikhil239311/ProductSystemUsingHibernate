package ProjectProduct;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class AsendingOrder {
	public static void main(String[] args) {

		Session session = MyConfig.getSession();
		String hbquery = "from Product order by name asc";
		Query query =session.createQuery(hbquery);
		List plist = query.list();
		
		for (Object object : plist) {
			if(object!=null) {
				System.out.println(object+ "\n");
		}else {
			System.out.println("Something went wrong ");
		}
		
	}
}}
