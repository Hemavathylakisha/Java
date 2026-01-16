package Exceptionhandling;
import java.io.*;

public class ThrowsException {
	static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        fr.read();
        fr.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            readFile();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e);
        }

	}

}
