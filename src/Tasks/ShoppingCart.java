package Tasks;
abstract class Product {
    protected int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    abstract double getPrice();
}
class Electronics extends Product{
	public Electronics(int id,String name,double price) {
		super(id,name,price);
	}
	
	double getPrice() {
		return price + (price * 0.18);
	}
}
class Clothing extends Product{
	public Clothing(int id,String name,double price) {
		super(id,name,price);
	}
	
	double getPrice() {
		return price + (price * 0.5);
	}
}
class CartItem{
	private Product product;
	private int quantity;
	
	public CartItem(Product product, int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	public double getItemTotal() {
		return product.getPrice() * quantity;
	}
	public String getItemDetails() {
		return product.name + ":" + " no of " + quantity + " = ₹ " + getItemTotal();
	}
}
class Shoppingadded {
	private CartItem[] items;
	private int count=0;
	public Shoppingadded(int size) {
		items=new CartItem[size];
	}
	public void addItem(Product product,int quantity) {
		items[count++]=new CartItem(product,quantity);
	}
	public void showCart() {
		System.out.println("Cart Details:");
		for(int i=0; i<count; i++) {
			System.out.println(items[i].getItemDetails());	
		}
	}
	public double calculateTotal() {
		double total = 0;
		for(int i=0; i<count; i++) {
			total += items[i].getItemTotal();
		}
		return total;
	}
}
public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "T-Shirt", 1000);
        
        Shoppingadded cart=new Shoppingadded(5);
        cart.addItem(p1, 2);
        cart.addItem(p2, 3);
        
        cart.showCart();
        System.out.println("\nTotal Amount = ₹" + cart.calculateTotal());

	}

}
