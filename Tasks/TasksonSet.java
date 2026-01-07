package Tasks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TasksonSet {
	//hasDuplicates
	public static boolean hasDuplicates(int[] arr) {
		Set<Integer> dummy=new HashSet<>(); 
		for(Integer num:arr) {
			if(!dummy.add(num)) {
				return true;
			}
		}
		return false;
	}
	//Palindrome check - 1 method
	public static boolean Palindrome(String str) {
		Set<Character> check=new LinkedHashSet<>(); 
		for(Character ch:str.toCharArray()) {
			if(check.contains(ch)) {
				check.remove(ch);
			}
			else {
				check.add(ch); 
			}
		}
		
		return check.size() <=1;
	}
	
	//Remove duplicates from given string
	public static String removeDuplicates(String text) {
		Set<Character> seen=new HashSet<>();
		StringBuilder result=new StringBuilder();
		for(char ch:text.toCharArray()) {
			if(seen.add(ch)) {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	
	//remove duplicates from an given array integer, maintains insertion order
	public static void removeDupliatesarr(int[] arr) {
		Set<Integer> dup=new LinkedHashSet<>();
		
		for(int num:arr) {
			dup.add(num);				
			}
		int[] result=new int[dup.size()];
		int i=0;
		for(int num:dup) {
			result[i++]=num;			
		}
		System.out.println(Arrays.toString(result));
	}
	//remove duplicates from an List of integers, maintains insertion order
		public static List<Integer> removeDupliateslist(List<Integer> list) {
			return	new LinkedList<>(new LinkedHashSet<>(list));
						
		}
		
	//Stored unique Student names
		public static void uniqueNames() {
			List<String> list=Arrays.asList("Seyon","Seyon","Likitha","Abi","Lord","Abi");
			Set<String> regNames=new LinkedHashSet<>(list);
			
			System.out.println("Registered Names:");
			for(String names:regNames) {
				System.out.println(names);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//duplicates exists an array
		int[] arr= {2,3,4,4,5,6,6};
		if(hasDuplicates(arr)) {
			System.out.println("Duplicates Exists");
		}else {
			System.out.println("No Duplicates");
		}
		
		//palindrome check
		String str= "madam";
		if(Palindrome(str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}	
		
		//remove duplicates from given string
		String text= "programming";
		System.out.println(removeDuplicates(text));
		
		//Remove duplicates from an array
		int[] arr1= {2,2,3,4,5,5,6};
		removeDupliatesarr(arr1);
		
		//remove duplicates from an list of integers
		List<Integer> addlist=Arrays.asList(2,4,5,6,6,7,7,2,1);
		List<Integer> result=removeDupliateslist(addlist);
		System.out.println(result);
		
		//Registered names stored in unique
		uniqueNames();
	}

}
