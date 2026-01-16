package Tasks;
class Account{
	private int balance=10000;
	
	public synchronized void Deposit(int amount,String name) {
		System.out.println(name + " " + "Trying to deposit: " + amount);
		balance+=amount;
		System.out.println("Amount successfully deposited: " + balance);
	}
	public synchronized void Withdraw(int amount,String name) {
		System.out.println(name + " " + "Trying to withdraw: " + amount);
		if(balance>=amount) {
			balance-=amount;
		}
		System.out.println("Amount has been deducted: " + balance);
	}
}
class Accessaccount extends Thread{
	Account acc;
	boolean isDeposit;
	int amount;
	Accessaccount(Account acc, boolean isDeposit, int amount, String name){
		super(name);
		this.acc=acc;
		this.isDeposit=isDeposit;
		this.amount=amount;
	}
	public void run() {
		if(isDeposit) {
			acc.Deposit(amount, getName());
		}else {
			acc.Withdraw(amount, getName());
		}
	}
}
public class Bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob=new Account();
		
		Accessaccount t1=new Accessaccount(ob,true,100,"thread1");
		Accessaccount t2=new Accessaccount(ob,true,200,"thread2");
		Accessaccount t3=new Accessaccount(ob,false,300,"thread3");
		Accessaccount t4=new Accessaccount(ob,true,400,"thread4");
		Accessaccount t5=new Accessaccount(ob,false,500,"thread5");
		Accessaccount t6=new Accessaccount(ob,false,600,"thread6");
		t1.start();
		t3.start();
		t4.start();
		
	}

}
