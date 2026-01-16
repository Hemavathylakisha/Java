package CollectionTasks;
import java.util.ArrayList;
import java.util.Scanner;

class Userprofile{
	int id;
	String name;
	String city;
	
	Userprofile(int id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	Userprofile(int id){
		this.id=id;
	}

}
class UserLists {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter removable id:");
		int id=sc.nextInt();
		
		ArrayList<Userprofile> list=new ArrayList<>();
		
		list.add(new Userprofile(1,"user1","chennai"));
		list.add(new Userprofile(2,"user2","madurai"));
		list.add(new Userprofile(3,"user3","tiruchy"));
		list.add(new Userprofile(4,"user4","nellai"));
		
		System.out.println("Before Deletion:");
		for (Userprofile u : list) {
            System.out.println(u.id + " " + u.name + " " + u.city);
        }
		
		boolean found=false;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).id==id) {
				list.remove(i);
			}
			found=true;
			System.out.println("Removed successfully");
			break;
		}
		System.out.println("After Deletion:");
		for (Userprofile u : list) {
            System.out.println(u.id + " " + u.name + " " + u.city);
        }
		sc.close();
	}

}
