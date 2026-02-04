package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamInAPImethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream process the collection of data, arrays, io operations(source). it does not store an data, we can print once. 
		//if we want to manipulate the result of data we can return the data by using collect method in intermediate operations
		//source->intermediate->terminal->result
		
		//source
		List<Integer> list=Arrays.asList(21,2,4,9,6,6,2,1,32);
		
		//Intermediate operations
		//Filter
//		Stream<Integer> f=list.stream().filter(n->n>9);
//		f.forEach(System.out::println);
		//f.forEach(System.out::println); //throws illegalstateException while try to recall stream because stream does not store
	
		//map
//		Function<Integer,Integer> m=new Function<Integer,Integer>(){
//			@Override
//			public Integer apply(Integer t) {
//				return t*2;
//			}
//			
//		};
		//list.stream().map(t->t*2).forEach(System.out::println);
		
		//distinct
//		Stream<Integer> d=list.stream().distinct().map(n->n*3);
//		d.forEach(System.out::println);
		
		//sorted
//		Stream<Integer> s=list.stream().sorted();
//		s.forEach(System.out::println);
		
		//limit
//		Stream<Integer> l=list.stream().limit(3);
//		l.forEach(System.out::println);
		
		//skip
//		Stream<Integer> sl=list.stream().skip(3);
//		sl.forEach(System.out::println);
		
		//peek
//		Stream<Integer> p=list.stream().peek(n->System.out.println(n)).map(n->n*2);
//		p.forEach(System.out::println);
		
		
		//Terminal operations
		//count
//		long c=list.stream().count();
//		System.out.println(c);
		
		//reduce
//		BinaryOperator<Integer> r=new BinaryOperator<Integer>() {
//			public Integer apply(Integer t, Integer u) {
//				return t+u;
//			}
//		};
//		Integer sum=list.stream().reduce(0,Integer::sum);
//		System.out.println(sum);
//		
//		Optional<Integer> sum1=list.stream().reduce(Integer::sum);
//		System.out.println(sum1);
		
		//List- return as list, map, arraylist, any collection use collect(), it takes collectors interface
		//return as list
//		List<Integer> cl=list.stream().filter(n->n>6).map(n->n*2).collect(Collectors.toList());
//		//cl.forEach(System.out::println);
//		System.out.println(cl);
		
		//return as set
//		Set<Integer> ls=list.stream().filter(n->n>6).map(n->n*2).collect(Collectors.toSet());
//		System.out.println(ls);
		
		//return as arraylist
//		ArrayList<Integer> al=list.stream().filter(n->n>6).map(n->n*2).collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(al);
		
		//return as Hashset
//		HashSet<Integer> hs=list.stream().filter(n->n>6).map(n->n*2).collect(Collectors.toCollection(HashSet::new));
//		System.out.println(hs);
		
		//return as map
		Function<Integer,Integer> f1=new Function<Integer,Integer>(){
			@Override
			public Integer apply(Integer t) {
				return t;
			}
		};
		Function<Integer,Integer> f2=new Function<Integer,Integer>(){
			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};
		Map<Integer,Integer> map=list.stream().filter(n->n>6).map(n->n*2).collect(Collectors.toMap(f1,f2));
		System.out.println(map);
		for(Entry<Integer,Integer> i:map.entrySet()) {
			System.out.println("Returned Value :" + i.getKey() + " -> " + i.getValue());
		}
		
		//return as hashMap
		//hashmap

				//key
						Function<Integer, Integer> hf1=new Function<Integer, Integer>() {
				
							@Override
							public Integer apply(Integer t) {
								return t;
							}
						};

				//value
						Function<Integer, Integer> hf2=new Function<Integer, Integer>() {
				
							@Override
							public Integer apply(Integer t) {
								return t*5;
							}
						};

				//merge - while duplicate elements
						BinaryOperator<Integer> bo=new BinaryOperator<Integer>() {
							
							@Override
							public Integer apply(Integer t, Integer u) {
								return t;
							}
						};
				//oldvalue - newvalue ->oldvalue 


				//type return
						Supplier<HashMap<Integer, Integer>> s1=new Supplier<HashMap<Integer,Integer>>() {
							
							@Override
							public HashMap<Integer, Integer> get() {
								return new HashMap<Integer, Integer>();
							}
						};
						HashMap<Integer,Integer> hm=list.stream().filter(n->n>6).map(n->n*2).collect(Collectors.toMap(hf1,hf2,bo,s1));
						System.out.println(hm);		
			
						//anyMatch
						boolean check=list.stream().anyMatch(n->n>6);
						System.out.println(check);

						//allMatch
						boolean check1=list.stream().allMatch(n->n>10);
						System.out.println(check1);
						
						//max
						Comparator<Integer> c=new Comparator<Integer>() {
							@Override
							public int compare(Integer o1,Integer o2) {
								return o1.compareTo(o2);
							}
						};
						
						Optional<Integer> max1=list.stream().max(c);
						System.out.println(max1);
						
						//min
						Optional<Integer> min=list.stream().min(c);
						System.out.println(min);
						
						//findFirst
						Optional<Integer> ff=list.stream().findFirst();
						System.out.println(ff);
						
						//findAny
						Optional<Integer> fa=list.stream().findAny(); //have a doubt with findAny
						System.out.println(fa);
	}	
	

}
