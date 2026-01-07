package Exceptionhandling;

public class ArithmeticExceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int[] arr=new int[3];
//			arr[5]=7;
//			int num = Integer.parseInt("abc"); // NumberFormatException
//			System.out.println(num);
			Object o=Integer.parseInt("10");
			String s=(String) o;
			System.out.println(s);
		}catch(ClassCastException e) {
			System.out.println("ClassCastException" + e);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException" + e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfboundsException" + e);
		}catch(Exception e) {
			System.out.println("exception error");
		}
		finally {
			System.out.println("Sucessfully executed");
		}
	}

}
