package Map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Map<String,Integer> m=new HashMap<String, Integer>();
    m.put("sss", 5);
    m.put("eee", 1);
    m.put("www", 1);
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		                     map.put("aab",1);
		                     map.put("xyz", 2);
		                     map.put("ijk", 3);
		                     map.put(null, 10);
		                     map.put("aab", 5);
		                     map.put("Ea", 1);
		                     map.put("FB", 1);
		                 System.out.println(map.get("ijk"));
		                   map.remove(null);
		                   map.remove("Ea");
		                     map.putAll(m);
		                System.out.println(map.containsKey("F"));
		                System.out.println(map.containsValue(1));
		                     System.out.println(map);
		                     
		        Set<String> keys= map.keySet(); //get keys from entries, returns as set
		        Collection<Integer> values=map.values(); //get values from entries 
		    Set<Entry<String,Integer>>  entrys=   map.entrySet(); //used in iteration of key value pair 
		        
		        System.out.println(keys);
		        System.out.println(values);
		        System.out.println(entrys);
		        
		      //For loop with iteration 
		   for(Entry<String,Integer> e:m.entrySet()) {
			   System.out.println(e.getKey()); //used to get key in single pair
			   System.out.println(e.getValue()); //used to get value in single pair
			   if(e.getKey()=="EA") {
				   System.out.println(e.getValue());  
			   }
		   }
		    
		   //ForEach
		   entrys.forEach(value->System.out.println(value));     

	}

}