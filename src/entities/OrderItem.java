package entities;

public class OrderItem {

	Integer quantity;
	Double price;
	Product prod;

	public OrderItem() {

	}



	public OrderItem(Integer quantity, Double price, Product prod) {
		this.quantity = quantity;
		this.price = price;
		this.prod = prod;
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = prod.getPrice();
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	public double subTotal() {
		return this.quantity * this.price;
		
	}

	@Override
	public String toString() {
		return prod.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
}
