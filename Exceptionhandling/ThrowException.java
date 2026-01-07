package Exceptionhandling;
import java.io.*;
class ArithmeticException extends Exception{
	ArithmeticException(String msg){
		super(msg);
	}
}
public class ThrowException {
	static void calculate(int age){
		if(age<18) {
			try {
		throw new ArithmeticException("vote is not eligible");
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("Eligible for Voting");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculate(27);
	}

}
