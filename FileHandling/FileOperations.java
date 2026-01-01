package FileHandling;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class FileOperations {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
	//	<!---Make directory----->
		  File dir = new File("D:\\java_Files");
//
//	        if (dir.exists()) {
//	            System.out.println("Directory already exists");
//	        } else {
//	            if (dir.mkdir()) {
//	                System.out.println("Directory created successfully");
//	            } else {
//	                System.out.println("Failed to create directory");
//	            }
//	        }
		
		//<!---Create file--->
//			 File file = new File("D:\\java_Files\\demo.txt");
//	
//		        try {
//		            if (file.createNewFile()) {
//		                System.out.println("File created successfully");
//		            } else {
//		                System.out.println("File already exists");
//		            }
//		        } catch (IOException e) {
//		            System.out.println("Error: " + e.getMessage());
//		        }
//		        
	        
	     //<!--File methods--->
//	        File file=new File(dir,"sample.txt");
//	        System.out.println("Name: " + file.getName());
//	        System.out.println("Path: " + file.getAbsolutePath());
//	        System.out.println("Writable: " + file.canWrite());
//	        System.out.println("Readable: " + file.canRead());
//	        System.out.println("Size: " + file.length());
		  
		  //<!--File Writer-->
//		  FileWriter fw=new FileWriter("D:\\java_Files\\sample.txt");
//		  fw.write("Welcome to the File handling Process page..");
//		  fw.close();
//		  System.out.println("File has written sucessfully");
		  
		  //<!--File Append-->
//		  FileWriter fw=new FileWriter("D:\\java_Files\\sample.txt", true);
//		  fw.write("\n File operations are:");
//		  fw.close();
//		  
//		 // <!--File Reader>
//		  FileReader fr=new FileReader("D:\\java_Files\\sample.txt");
//		  int ch;
//		  while((ch=fr.read())!=-1) {
//			 System.out.println((char) ch); 
//		  }
//		  fr.close();
		  
		//  <!--Buffer Reader-->
//		 BufferedReader br=new BufferedReader(new FileReader("D:\\java_Files\\sample.txt")); 
//		 String line;
//		 while((line=br.readLine())!=null) {
//			 System.out.println(line);
//		 }
//		 br.close();
		 
		 //<!--BufferedWriter-->
//		 BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\java_Files\\sample.txt")); 
//		 bw.write("Files are handling with conditions. Features of BufferReader and Buffer Writer:");
//		 bw.newLine();
//		 bw.write("No needed casting and easier to handling, faster..");
//		 bw.close();
		 
		  
//		  //<!--FileOutputstream-->
//		  	FileOutputStream fos = new FileOutputStream("D:\\java_Files\\bin.dat");
//	        fos.write(65); // A
//	        fos.close();
//	        
//		 // <!--FileInputstream-->
//	        FileInputStream fis = new FileInputStream("D:\\java_Files\\bin.dat");
//	        int i;
//	        while ((i = fis.read()) != -1) {
//	            System.out.print((char) i);
//	        }
//	        fis.close();
		  
		  File file = new File("D:\\java_Files\\demo.txt");
		  file.delete();
}
}
