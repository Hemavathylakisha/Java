package Multithreading;

//when we perform multithreading occurs data inconsistency 
//Synchronization allows to overcome the data inconsistency problem 
// ---> Method level (object lock) object level should pass the value by using constructor
// ---> Static Level (class lock) without call object points directly to the class name 
// ---> Block level 

class Officeprinter{
	//object or method level lock
//	public synchronized void printDocument(String user, String doc) {
//		for(int i=1; i<=3; i++) {
//			System.out.println(user + " Printing started " + doc + " page no " + i);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}
	
	//Block level lock
	public void printDocument(String user, String doc) {		 
		for(int i=1; i<=3; i++) {
			synchronized(this) {
			System.out.println(user + " Printing started " + doc + " page no " + i);
			}
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
		}		
	}
	
	// --- Class-level lock (static synchronized) ---
//    public static synchronized void printStatic(String user, String doc) {
//        for(int i=1; i<=3; i++) {
//            System.out.println(user + " printing STATIC " + doc + " page " + i);
//        }
//    }
}
class Employeethread implements Runnable{
	private Officeprinter print;
	private String user;
	private String doc;
	
	Employeethread(Officeprinter print, String user, String doc){
		this.print=print;
		this.user=user;
		this.doc=doc;
	}
	public void run() {
		print.printDocument(user, doc);
		//Officeprinter.print(user, doc);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Officeprinter printer=new Officeprinter();
		
		//Officeprinter staticprinter=new Officeprinter();//class level static synchronization
		
		Thread emp1=new Thread(new Employeethread(printer, "emp1", "employeedetails.txt"));
		Thread emp2=new Thread(new Employeethread(printer, "emp2", "invoice.docx"));
		Thread emp3=new Thread(new Employeethread(printer, "emp3", "userCopy.ppt"));
		
//		emp3.setPriority(10);
//		emp1.setPriority(4);
//		emp2.setPriority(3);
		emp1.start();
		emp2.start();
		emp3.start();
	}

}
