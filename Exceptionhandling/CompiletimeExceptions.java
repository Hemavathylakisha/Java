package Exceptionhandling;
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;

class Student implements Cloneable{
    int id = 10;
    
    protected Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
}
abstract class Demo {
}

public class CompiletimeExceptions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IOException
//		try {		
//			FileReader file=new FileReader("File.txt");
//			file.read();
//		}catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		//FileNotFoundException
//		try {
//            FileInputStream fis = new FileInputStream("nofile.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
		
		//EndofFileException
//		try {
//            DataInputStream dis =
//                new DataInputStream(new FileInputStream("data.txt"));
//            dis.readInt(); // no data
//        } catch (EOFException e) {
//            System.out.println("End of file reached");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		//MalformedURLException
//		try {
//            URL url = new URL("htp://invalid.com/");
//        } catch (MalformedURLException e) {
//            System.out.println("Invalid URL");
//        }
		//ClassNotFoundException
//		try {
//            Class.forName("com.fake.MyClass");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Class not found");
//        }
		
		//CloneNotSupportedException
//		 Student s = new Student();
//	        try {
//	            Student s2 = (Student) s.clone();
//	            System.out.println(s.id);
//	            System.out.println(s2.id);
//	        } catch (CloneNotSupportedException e) {
//	            System.out.println("Clone not supported");
//	        }
	       
	        //InterruptedException
//	        try {
//	            Thread.sleep(1000);
//	        } catch (InterruptedException e) {
//	            System.out.println("Thread interrupted");
//	        }
		
		//SQLException
//		try {
//            DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/test",
//                "root",
//                "wrongpassword"
//            );
//        } catch (SQLException e) {
//            System.out.println("SQL Exception occurred");
//        }
		//ParseException
//		try {
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//            Date d = sdf.parse("2024/01/01");
//        } catch (ParseException e) {
//            System.out.println("Parse exception occurred");
//        }
		//InstantiationException
//		try {
//            Class c = Class.forName("Demo");
//            c.newInstance();
//        } catch (InstantiationException e) {
//            System.out.println("Instantiation exception");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		//NoSuchMethodException
//		try {
//            Class c = Student.class;
//            c.getDeclaredMethod("display");
//        } catch (NoSuchMethodException e) {
//            System.out.println("Method not found");
//        }
		//TimeoutException
		try {
            FutureTask task = new FutureTask(() -> {
                Thread.sleep(2000);
                return null;
            });
            new Thread(task).start();
            task.get(1, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.out.println("Operation timed out");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
