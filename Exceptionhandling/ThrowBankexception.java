package Exceptionhandling;
//class InsufficientException extends Exception{
//	InsufficientException(String msg){
//		super(msg);
//	}
class InsufficientException extends Exception{
		InsufficientException(String msg){
			super(msg);
		}
}
public class ThrowBankexception {
	
	static void Bank(int amount) throws InsufficientException{
		if(amount<5000) {
			throw new InsufficientException("Insufficient balance, check your account");
		}else {
			System.out.println("Successfully recieved");
		}
	}
	public static void main(String[] args) throws InsufficientException{
		// TODO Auto-generated method stub
		
		Bank(4000);
//		try {
//			Bank(4000);
//		}catch(InsufficientException e) {
//			System.out.println(e.getMessage());
//		}
	}

}
