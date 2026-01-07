package Tasks;
import java.util.ArrayList;

interface BAccount{
	void displayDetails();
}
class Savingaccount implements BAccount{
	int acc_no;
	int balance;
	double interest_rate;
	Savingaccount(int acc_no,int balance,double interest_rate){
		this.acc_no=acc_no;
		this.balance=balance;
		this.interest_rate=interest_rate;
	}
	
	public void displayDetails() {
		System.out.println("Savings: " + "Accno - " + acc_no + " Balance: " + balance + " Interest Rate: " + interest_rate);
	}
}
class Currentaccount implements BAccount{
	int acc_no;
	int balance;
	int overdraftLimit;
	Currentaccount(int acc_no,int balance,int overdraftLimit){
		this.acc_no=acc_no;
		this.balance=balance;
		this.overdraftLimit=overdraftLimit;
	}
	
	public void displayDetails() {
		System.out.println("Current: " + "Accno - " + acc_no + " Balance: " + balance + " Overdraft Limit: " + overdraftLimit);
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BAccount> accounts=new ArrayList();
		
		accounts.add(new Savingaccount(101, 50000, 4.5));
        accounts.add(new Currentaccount(201, 70000, 15000));
        accounts.add(new Savingaccount(102, 90000, 5.2));
        
        for(BAccount acc:accounts) {
        	acc.displayDetails();
        }
	}

}
