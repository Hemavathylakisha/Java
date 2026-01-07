package Tasks;
import java.util.Scanner;

//custom exception
class TicketNotAvailableException extends Exception{
	public TicketNotAvailableException(String msg) {
		super(msg);
	}
}

class TicketCounter{
	private int availableticket = 50;
	
	public synchronized void bookTicket(String username, int tickets) throws TicketNotAvailableException{
		System.out.println(username + " Trying to book tickets " + "of " + tickets);
		if(availableticket < tickets) {
			throw new TicketNotAvailableException("Sorry, " + username + ", " + tickets + " tickets not available");
		}
		availableticket-=tickets;
		System.out.println(username + " booked successfully with " + tickets + " tickets.Remaining : " + availableticket);
	}
}
class UserThread extends Thread{
	TicketCounter counter;
	String user;
	int tickets;
	
	UserThread(TicketCounter counter, int tickets, String user){
		this.counter=counter;
		this.user=user;
		this.tickets=tickets;
	}
	public void run(){
		try {
			counter.bookTicket(user, tickets);
		}catch(TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Printtickcketavailability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TicketCounter counter=new TicketCounter();
		
		int[] request=new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("User" + (i+1) + ":");
			request[i]=sc.nextInt();
		}
		
		UserThread u1 = new UserThread(counter, request[0], "User-1");
		UserThread u2 = new UserThread(counter, request[1], "User-2");
        UserThread u3 = new UserThread(counter, request[2], "User-3");
        UserThread u4 = new UserThread(counter, request[3], "User-4");
        UserThread u5 = new UserThread(counter, request[4], "User-5");
		
		u1.start();
		u2.start();
		u3.start();
		u4.start();
		u5.start();

	}

}
