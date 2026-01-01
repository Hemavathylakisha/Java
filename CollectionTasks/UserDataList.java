package CollectionTasks;
import java.util.ArrayList;
import java.util.Scanner;

class User{
int id;
String name;
String city;
int phoneno;

User(int id,String name,String city,int phoneno){
	this.id=id;
	this.name=name;
	this.city=city;
	this.phoneno=phoneno;
}
}

public class UserDataList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> list=new ArrayList<>();
		
		User data1=new User(1,"user1","chennai",111111);
		User data2=new User(2,"user2","mumbai",222222);
		User data3=new User(3,"user3","bangalore",333333);
		User data4=new User(4,"user4","kerala",444444);
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add(data4);
		
		for(User view:list) {
			System.out.println("ID: " + view.id);
			System.out.println("Name: " + view.name);
			System.out.println("City: " + view.city);
			System.out.println("Phone no :" + view.phoneno);
			System.out.println("\n");
		}
		
		System.out.println("Enter the id to Delete: ");
		Scanner sc=new Scanner(System.in);
		int getid=sc.nextInt();
		
		ArrayList<User> toRemove=new ArrayList<>();
		
		for(User data:list) {
			if(getid==data.id) {
				toRemove.add(data);
			}
		}
		
		list.removeAll(toRemove);
		
		System.out.println("---------------Final User data After Delete: ----------");
		for(User view:list) {
			System.out.println("ID: " + view.id);
			System.out.println("Name: " + view.name);
			System.out.println("City: " + view.city);
			System.out.println("Phone no :" + view.phoneno);
			System.out.println("\n");
		}
		
		sc.close();
	}

}
