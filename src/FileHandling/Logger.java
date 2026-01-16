package FileHandling;
import java.io.*;      

// used Buffered reader and writer no data loss, no type casting and efficient way for optimization
// logs are appended, clean and safe

public class Logger {
	
	public static void log(String message) {
		 File dir = new File("D:\\java_Files");
	     File file = new File(dir, "app.txt");
	     
	     try {
	    	if(!dir.exists()) {
	    		dir.mkdir();
	    	}
	    try(BufferedWriter bw=new BufferedWriter(new FileWriter(file, true))) {	
	    	bw.write(message + System.lineSeparator());
	    	bw.close();
	    }
	    	
	     }catch(Exception e) {
	    	 System.out.println(e.getMessage()); 
	     }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger.log("Application log");
		Logger.log("Application added");
		Logger.log("Application updated");
	}

}
