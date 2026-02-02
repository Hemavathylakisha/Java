package BankManagement; 
import java.util.Optional; 
import java.util.function.Function;
@FunctionalInterface 
//Functional interface to handle bank account object 
interface Bankaccount{ //abstract method for bank object validate 
	public void validate(Bank b); 
	//Default method to display verification message 
	default void display() { 
		System.out.println("Bank account successfully verified"); 
		} 
	
	//Static method to check bank balance greater than or equal to 5000 
	static Boolean isValidbalance(Double balance) {
		return balance>=5000;
		}
	//MethodReference for name display in Uppercase 
	public static String toUpper(String acc_username) { 
		return acc_username.toUpperCase(); 
		} 
	}
class Bank{ 
	private String acc_username; 
	private String acc_type; 
	private double balance; 
	
	public Bank(String acc_username, String acc_type, double balance) {
		super();
		this.acc_username = acc_username; 
		this.acc_type = acc_type; 
		this.balance = balance; 
		} 
	public Optional<String> getAcc_username() { 
		return Optional.ofNullable(acc_username);
		} 
	public Optional<String> getAcc_type() {
		return Optional.ofNullable(acc_type); 
		} 
	public Optional<Double> getBalance() { 
		return Optional.ofNullable(balance); 
		} 
	} 
public class BankService {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		Bank acc1 = new Bank("Mahesh", null, 12000.0); 
		Bank acc2 = new Bank("Ramesh", "Current account", 3000.0); 
		Bank acc3 = null; Bank acc4 = new Bank(null, "Joint account", 15000.0); 
		
		//account checking 
		Optional<Bank> validateacc=Optional.ofNullable(acc2);
		
		//account not exists throw exception with default message 		
		validateacc.orElseThrow(()-> new RuntimeException("Invalid account")); 
		
		//Method reference - Convert account holder name to uppercase 
		Function<String,String> acc_name=Bankaccount::toUpper; 
		
		//Account holder exists display name 
		validateacc.flatMap(Bank::getAcc_username).map(acc_name).ifPresent(n->System.out.println("Account Holder : " + n)); 
		
		//Type checking in account holder not exists display default type 
		String defaulttype=validateacc.flatMap(Bank::getAcc_type).orElse("Saving Account");
		System.out.println("Account Type : " + defaulttype); 
		
		//Balance Active state or inactive state 
		Boolean isActive=validateacc.flatMap(Bank::getBalance).map(Bankaccount::isValidbalance).orElse(false);
		System.out.println("Bank Status : " + (isActive?"Active":"Inactive")); 
		
		//once verified call default method 
		Bankaccount ba=p-> {};
		ba.display(); 
		}
}
