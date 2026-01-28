package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface sample{
	public void data();
	default void sample() {
		System.out.println("default method");
	}
	static void demo() {
		System.out.println("static method");
	}
}
class User{ //used for Predicate
	 String name;
	int age;
	int salary;
	boolean status;
	
	public User(String name, int age, int salary, boolean status) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.status = status;
	}
	
}
class Emp{ //used for BiPredicate
	String name;
	String password;
	int age;
	int salary;
	public Emp(String name, String password, int age, int salary) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.salary = salary;
	}
	
}
class Stu{ //used for consumer
	String name;
	int age;
	String dept;
	public Stu(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
}
public class DefaultandStaticmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User("abi",23,50000,false);
		User u2=new User("hema",35,60000,true);
		User u3=new User("liki",25,40000,false);
		User u4=new User("seyon",33,20000,true);
		
		//abstract method
		Predicate<User> ageCheck= n-> n.age >25;
		System.out.println(ageCheck.test(u4));
		
		//default method in Predicate
		
		Predicate<User> statusCheck=n-> n.status;
		
		Predicate<User> andResult=ageCheck.and(statusCheck);
		Predicate<User> orResult=ageCheck.or(statusCheck);
		Predicate<User> negateResult=statusCheck.negate();
		
		System.out.println("and method: " + andResult.test(u2));
		System.out.println("or method:  " + orResult.test(u3));
		System.out.println("negate method: " + negateResult.test(u3));

		//static method in Predicate
		List<String> list=Arrays.asList("null","ADMIN","User");
		
		//list.stream().filter(null).forEach(System.out::println); //throws null pointer exception 
		
		list.stream().filter(Predicate.isEqual("null")).forEach(System.out::println); // avoids exceptions
		
		//BiPredicate - no static method, only test method of abstract and default methods
		BiPredicate<Integer, Integer> check=(a,b)->a>b ;
		
		System.out.println(check.test(20, 12));
		
//		BiPredicate<String,String> c1=(user,pass)->user.equals("hema") && pass.equals("1111");
//		System.out.println(c1.test("hema","0000"));
//		System.out.println(c1.test("hema", "1111"));
//		
//		BiPredicate<Double,Integer> datacheck=(s,a)->s>50000.00 && a<30;
//		System.out.println(datacheck.test(61000.20, 25));
//		System.out.println(datacheck.test(48000.20, 32));
		
		
		Emp e1=new Emp("Abi","111",23,50000);
		Emp e2=new Emp("Hema","222",35,60000);
		Emp e3=new Emp("Liki","333",25,40000);
		Emp e4=new Emp("Seyon","444",33,20000);
		
		BiPredicate<Emp,Emp> b1=(u,p)->u.name.equals("Hema") && p.password.equals("222");
		BiPredicate<Emp,Emp> b2=(u,p)->u.name.startsWith("H") && p.name.endsWith("i");
//		System.out.println(b1.test(e1, e1));
//		System.out.println(b2.test(e1, e1));
		
		BiPredicate<Emp, Emp> b3=b1.and(b2);
		System.out.println("and method :"+b3.test(e2, e2));
		
		BiPredicate<Emp, Emp> b4=b1.or(b2);
		System.out.println("or method :"+b4.test(e2, e2));
		
		BiPredicate<Emp, Emp> b5=b1.negate();
		System.out.println("negate method :"+b5.test(e1, e1));

		//Consumer - no return , takes input , default methods .andThen() - for chaining process
		//BiConsumer - has no default methods, takes 2 arguments
		Stu s1=new Stu("Abi",17,"CSC");
		Stu s2=new Stu("Hema",25,"COMM");
		
		//consumer predefined method
		Consumer<Stu> c1=(n)->System.out.println(n.name.toUpperCase());
		Consumer<Stu> c2=(a)->System.out.println(a.age);
		Consumer<Stu> c3=n->System.out.println(n.dept);
		c1.accept(s1);
		c2.accept(s1);
		c3.accept(s2);
		
		//default method
		Consumer<Stu> res=c1.andThen(c2).andThen(c3);
		res.accept(s1);
		
		//BiConsumer 
		BiConsumer<Stu,Stu> c4=(n,d)->System.out.println("Name : "+ n.name + "  Department : "+ d.dept);
		BiConsumer<Stu,Stu> c5=(n,d)->System.out.println("Name : "+ n.name + "  Age : "+ d.age);
		c4.accept(s1, s2);
		c5.accept(s1, s2);
		
		//BiConsumer default method
		BiConsumer<Stu,Stu> result=c4.andThen(c5);
		result.accept(s1, s2);
	
		//Function - take input, return output, Function - default method (andThen, compose)
		Function<String,Integer> f1=(s)->s.length();
		Function<Integer,String> f2=(s)->"Length :" + s;
		
		//Function - default method for andThen
		Function<String,String> funres=f1.andThen(f2);  //andThen - performs f1 and then f2
		System.out.println(funres.apply("   Java   "));
		
		//Function - default method for compose
		Function<String,Integer> f3=(s)->s.length();
		Function<String,String> f4=(s)-> s.trim();
		
		Function<String,Integer> comres=f3.compose(f4); //compose - performs f2 and then f1
		System.out.println(comres.apply("   Java    "));
		
		//Convert string "50678.00" to double 6789.00
		Function<String,Double> StringtoDouble= s-> Double.parseDouble(s); 
		
		Function<Double,Double> Doubledisplay= d -> d % 1000000;
		
		Function<String,Double> doubleresult=StringtoDouble.andThen(Doubledisplay);
		Function<String,Double> doubleresult1=Doubledisplay.compose(StringtoDouble);
		System.out.println("Using andThen : " + doubleresult.apply("50678.00"));
		System.out.println("Using compose : " + doubleresult1.apply("43623.00"));
		
		//BiFunction - takes 2 input and return output, pass 3 arguments - andThen default method and no static methods, only one abstract method
		BiFunction<String,String,String> bf=(a,b) -> "Fullname : " + a + " " + b ;
		System.out.println(bf.apply("Hemavathy", "Lakisha"));
		
		BiFunction<Double,Integer,Double> bf1= (a,b) -> a * b;
		System.out.println(bf1.apply(1234.89, 3457));
		
		
		//BiFunction - Default method - andThen() it perform one BiFunction and one Function only will return the output
		BiFunction<Integer, Integer, Integer> multiply =(a, b) -> a * b;

        Function<Integer, String> convertToString = s -> "Result: " + s;

        String output = multiply.andThen(convertToString).apply(5, 4);

        System.out.println(output);
	}
	
}
