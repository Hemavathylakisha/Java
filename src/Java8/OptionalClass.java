package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
//Optional class is a container class, it might be present value or might be absence
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Optional<String> s1=Optional.of("Hi");
			Optional<String> s2=Optional.ofNullable(null);
			Optional<String> s3=Optional.empty();
			
			//get
//				System.out.println(s1.get());	//throws null pointer exception
//				System.out.println(s2.get());	
//				System.out.println(s3.get());	
			
			//ifPresent - java 8 - isEmpty in java11+
			s1.ifPresent(n->System.out.println("value :"+n));
			
			//isPresent
			if(s2.isPresent()) {
				System.out.println("Value of: " + s2.get());
			}
			
			//ifPresentOrElse
			s2.ifPresentOrElse(n->System.out.println("ifPresentOrElse value :"+n),()->System.out.println("value not found")); 
			//orElse
			System.out.println(s2.orElse("defalut value")); //only pass value 
			//orElseGet
			System.out.println(s2.orElseGet(()->"default value for orElseGet")); //pass supplier 
			
			String list=Arrays.asList("Hema","Lakisha","Liki","Abi","Layola")
					.stream()
					.filter((n)->n.toLowerCase().startsWith("l"))
					.findFirst()
					.orElse(check());
			
			System.out.println(list);
			
			String list1=Arrays.asList("Hema","Lakisha","Liki","Abi","Layola")
					.stream()
					.filter((n)->n.toLowerCase().startsWith("A"))
					.findFirst()
					.orElseGet(()->check());
			System.out.println(list1);
			//orElseThrow
			try {
				String Message=s3.orElseThrow(()->new RuntimeException("Value not present"));
				System.out.println(Message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			//RealTime - Using Map 
			String mapresult=s1.map(String::toUpperCase).orElse("Welcome Back..!!");
			System.out.println(mapresult);
			
			//same method in anonymous class
//			String mapResult=s1.map(new Function<String,String>() {
//				@Override
//				public String apply(String s) {
//					return s.toUpperCase();
//				}
//			}).orElse("WELCOME BACK..!");
//			System.out.println(mapResult);
			
			//FlatMap - when use nested objects or nested lists
			List<Integer> fmlist=Arrays.asList(10,20,30,40,50);
			List<Integer> fmlist1=Arrays.asList(11,22,33,44,55);
			
			//map
			System.out.println("list iteration using map");
			fmlist.stream().map(n->n*10).forEach(System.out::println);
			
			//flatMap
			System.out.println("list iteration using flatmap");
			List<List<Integer>> fmlist2=Arrays.asList(fmlist,fmlist1);
			fmlist2.stream().flatMap(n->n.stream()).map(n->n*10).forEach(System.out::println);
			
	}
	public static String check() {
		System.out.println("print first");
		return "hello";
	}
}
