package ProjectProduct;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
@Id
	int id;
	String name;
	int qty;
	double price;
	String mfgdate;
	String expdate;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, int qty, double price, String mfgdate, String expdate) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
		this.expdate = expdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + ", mfgdate=" + mfgdate
				+ ", expdate=" + expdate + "]";
	}

}
