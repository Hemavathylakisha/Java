package Tasks;

//custom exception
class OutofStockException extends Exception {
	public OutofStockException(String msg) {
		super(msg);
	}
}

public class StockUpdation {
	static int stock=10;
	static void getStock(int quantity) throws OutofStockException{
		if(quantity>stock) {
			throw new OutofStockException("Not available Stock: " + " wait sometime to stock update..");
		}
		else {
		stock-=quantity;
		System.out.println("Successfully purchased stock with.." + quantity);	
		}
	}
	static void updateStock() {
		for(int i=10;i<=100;i++) {
		stock=i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateStock();
		try {
			getStock(12);
		}
		catch(OutofStockException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Current Stock balance: " + stock);
		}
	}
}
