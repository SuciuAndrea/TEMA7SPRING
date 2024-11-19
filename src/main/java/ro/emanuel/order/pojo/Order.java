package ro.emanuel.order.pojo;

public class Order {
	
	private int id;
	private String customer;
	private String product;
	private int quanity;
	private double price;
	
	public Order() {
	}

	public Order(int id, String customer, String product, int quanity, double price) {
		super();
		this.id = id;
		this.customer = customer;
		this.product = product;
		this.quanity = quanity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
		
		
	}
	


