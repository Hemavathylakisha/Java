package Arrays;
import java.util.Arrays;

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
}
public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {30, 10, 50, 20};

	        Arrays.sort(arr);
	        System.out.println(arr.length);
	        System.out.println(Arrays.toString(arr));
	        System.out.println(Arrays.copyOf(arr,3));
	        int index = Arrays.binarySearch(arr, 20);
	        System.out.println("Found at index: " + index);
	        
	        Student[] s = new Student[2];
	        s[0] = new Student(1, "Hema");
	        s[1] = new Student(2, "Lakisha");

	        for(Student st : s) {
	            System.out.println(st.id + " " + st.name);
	        }
	}

}
