package CollectionTasks;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	int rollno;
	String name;
	String dob;
	String city;
	long phone;
	
	Student(int rollno, String name, String dob, String city, long phone){
		this.rollno=rollno;
		this.name=name;
		this.dob=dob;
		this.city=city;
		this.phone=phone;
	}
}
public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<Student> list=new LinkedList<>();
	 Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of students: ");
     int n = sc.nextInt();
     sc.nextLine(); // clear buffer

     // CREATE 
     for (int i = 1; i <= n; i++) {
         System.out.println("\nEnter details of student " + i);

         System.out.print("Roll No: ");
         int rollno = sc.nextInt();
         sc.nextLine();

         System.out.print("Name: ");
         String name = sc.nextLine();

         System.out.print("DOB: ");
         String dob = sc.nextLine();


         System.out.print("City: ");
         String city = sc.nextLine();

         System.out.print("Phone: ");
         long phone = sc.nextLong();
         sc.nextLine();

         list.add(new Student(rollno, name, dob, city, phone));
     }	

	 //READ
		 System.out.println("----------------PRINTING STUDENT DATA---------------------\n");
		 for (Student s : list) {
	            System.out.println("Roll No : " + s.rollno + " | Name    : " + s.name + " | DOB     : " + s.dob + " | City    : " + s.city + " | Phone   : " + s.phone);	            
	            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
	        }
		 
	//UPDATE
		 Scanner updatescan=new Scanner(System.in);
		 System.out.print("Enter student rollno to update data: ");
	       int searchrollno=updatescan.nextInt();
	       updatescan.nextLine();
	       
	       boolean update=false;
	       
	       for(Student s:list) {
	    	   if(s.rollno==searchrollno) {
	    		   System.out.print("Enter new city: ");
	    	        s.city = updatescan.nextLine();

	    	        System.out.print("Enter new phone number: ");
	    	        s.phone = updatescan.nextLong();
	    	        updatescan.nextLine();
	    	        
	    	        update=true;
	    	        break;
	    	   }
	       }
	       System.out.println("------------------------------------------------------");
	       if(update) {
	    	   System.out.println("STUDENT UPDATED SUCCESSFULLY");
	       } else {
	           System.out.println("STUDENT NOT FOUND");
	       }
	       
	       System.out.println("\n----- STUDENT LIST AFTER UPDATED----------------------------------------------------------------------------------------------------");
	       for (Student s : list) {
	    	   System.out.println("Roll No : " + s.rollno + " | Name    : " + s.name + " | DOB     : " + s.dob + " | City    : " + s.city + " | Phone   : " + s.phone);	            
	            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
	       }
	       
	       //DELETE
	       Scanner deletescan =new Scanner(System.in);
	       System.out.println("Enter rollno of student to Delete:");
	       int deleteRoll=deletescan.nextInt();
	       deletescan.nextLine();
	       
	       Student deleteStudent =null;
	       for (Student s : list) {
	    	   if(deleteRoll==s.rollno) {
	    		   deleteStudent=s;
	    		   break;
	    	   }
	       }
	       System.out.println("------------------------------------------------------");
	       if(deleteStudent!=null) {
	    	   list.remove(deleteStudent);
	    	   System.out.println("STUDENT DELETED SUCCESSFULLY");
	       } else {
	    	    System.out.println("STUDENT NOT FOUND");
	    	}
	       
	       System.out.println("\n----- STUDENT LIST AFTER DELETED----------------------------------------------------------------------------------------------------");
	       for (Student s : list) {
	    	   System.out.println("Roll No : " + s.rollno + " | Name    : " + s.name + " | DOB     : " + s.dob + " | City    : " + s.city + " | Phone   : " + s.phone);	            
	            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
	       }
	       
	       deletescan.close(); //delete scanner close
	       sc.close(); //add or retrieve scanner close
	       updatescan.close(); //update scanner close
		 }
}
