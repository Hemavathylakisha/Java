package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m=new LinkedHashMap<String, Integer>();
	    m.put("sss", 5);
	    m.put("eee", 1);
	    m.put("www", 1);
		
	Map<String,Integer> map=new LinkedHashMap<String, Integer>();
		                     map.put("aab",1);
		                     map.put("xyz", 2);
		                     map.put("kjk", 3);
		                     map.put(null, 10);
		                     map.put("rrd", 5);
		                     map.put("aa", 1);
		                     map.put("AA", 1);
		                 System.out.println(map.get("kjk"));
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
		        
		    for(String k:keys) {
		    	System.out.println(k);
		    }
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
		   
		   //For access maintains eg:
		   Map<Integer,Integer> m3=new LinkedHashMap<Integer, Integer>(16,0.75f,true);
		   m3.put(1, 1);
		   m3.put(2, 1);
		   m3.put(3, 1);
		   m3.put(4,1);
		   System.out.println(m3);
		   m3.get(1);
		   m3.get(3);
		   System.out.println(m3);
		   
	}

}