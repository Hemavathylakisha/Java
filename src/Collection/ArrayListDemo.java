package Collection;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Java");
		list.add("program");
		
        String[] arr = list.toArray(new String[0]);
        
        System.out.println(arr);
//        for (String s : arr) {
//            System.out.println(s);
//        }
	}

}
