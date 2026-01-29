package Java8;

import java.util.Optional;

class UserData{
	private String name;
	private String email;
	private Integer age;
	public UserData(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public Optional<String> getName(){
		return Optional.ofNullable(name);
	}
	public Optional<String> getEmail(){
		return Optional.ofNullable(email);
	}
	public Optional<Integer> getAge(){
		return Optional.ofNullable(age);
	}
}
public class TaskOnOptionalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserData user=new UserData("Hema","hema@gmail.com",36);
		
			//Convert name to UPPERCASE
			user.getName().map(String::toUpperCase)   
			.ifPresent(name->{ 
				
			 //Check if user age is 18 or above
			boolean isValid=user.getAge().map(age->age>=18).isPresent();
			
			// If email is missing, return default email
			String isEmail=user.getEmail().orElse("default@mail.com");
			
			//Print profile only if name is present
			System.out.println("----- USER PROFILE -----"); 
            System.out.println("Name  : " + name);
            System.out.println("Email : " + isEmail);
            System.out.println("Age valid : " + isValid);
		 });
		
		 //If user object is missing, throw custom exception
		 Optional<UserData> validuser=Optional.ofNullable(user);
		 
				 validuser.orElseThrow(()->new RuntimeException("User not found"));
		 	 
	}

}
