package Association;

class EmpAddress {
    String city, state;
    EmpAddress(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class BankAccount {
    String accNo;
    double balance;

    BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void showAccount() {
        System.out.println("Acc No: " + accNo + ", Balance: " + balance);
    }
}

class Employee {
    String name;
    EmpAddress address;
    BankAccount account;  // aggregation

    Employee(String name, EmpAddress address, BankAccount account) {
        this.name = name;
        this.address = address;
        this.account = account;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Address: " + address.city + ", " + address.state);
        account.showAccount();
    }
}

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpAddress addr = new EmpAddress("Bangalore", "Karnataka");
	        BankAccount acc = new BankAccount("ACC1234", 50000);

	        Employee emp = new Employee("Rahul", addr, acc);
	        emp.display();
	}

}
