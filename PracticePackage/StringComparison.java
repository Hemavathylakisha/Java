package PracticePackage;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";  // stores in SCP
		s = s + " World";  // immutable - we can only reassign the variable to change the value so creates extra memory
		System.out.println("String value: " + s);
		
		//StringBuilder - not thread safe, fast, no synchronisation, best for single thread mutable
		StringBuilder sb=new StringBuilder("Hello ");
		sb.append("World");
		System.out.println("String Builder: " + sb);    //Rich methods (append, insert, delete, reverse)
		
		//String Buffer - thread safe, slower, synchronized, best for multithreads, mutable
		StringBuffer sf=new StringBuffer("Hello ");
		sf.append("World");
		System.out.println("String Buffer: " + sf); 
		sf.insert(0, "hi ");              //Rich methods (append, insert, delete, reverse)
		System.out.println(sf);
		
		//String methods
		String sm = "Java Programming";

        System.out.println("Length: " + sm.length());
        System.out.println("Char at index 3: " + sm.charAt(3));
        System.out.println("Substring: " + sm.substring(5));
        System.out.println("UpperCase: " + sm.toUpperCase());
        System.out.println("Contains 'Pro': " + sm.contains("Pro"));
        
        
        String s1 = "Java";
        String s2 = "java";

        System.out.println(s1.equals(s2));              // false
        System.out.println(s1.equalsIgnoreCase(s2));    // true
        System.out.println(s1.compareTo(s2)); 
        
        String ss = "apple,banana,grapes";

        String[] fruits = ss.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(ss.replace("banana", "mango"));
	}

}
