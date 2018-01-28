package ExamplesonCollections;

public class Product {

	private int productId;
	private String productName;
	private String productDiscreption;
	private double productPrice;

	public Product(int productId, String productName, String productDiscreption, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productDiscreption = productDiscreption;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDiscreption() {
		return productDiscreption;
	}

	public void setProductDiscreption(String productDiscreption) {
		this.productDiscreption = productDiscreption;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDiscreption="
				+ productDiscreption + ", productPrice=" + productPrice + "]";
	}

}
