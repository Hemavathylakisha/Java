package Tasks;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.lang.String;

public class TasksOnMap {
	//frequent characters
	public static void freqCharacters() {
		System.out.println("--------------Most Occurence Character--------------");
		String str="JavaIndependent";
		Map<Character, Integer> map=new HashMap<>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue() > 1) {
				 System.out.println(entry.getKey() + " : " + entry.getValue());
				}
		}
		System.out.println();
	}
	
	//frequent Words	
		public static void freqWords(String str) {
			System.out.println("--------------Most Occurence Words--------------");
			String[] words=str.toLowerCase().split(" ");
			Map<String, Integer> map=new HashMap<>();
			
			for(String word : words) {
				map.put(word, map.getOrDefault(word, 0)+1);
			}
			for(Map.Entry<String,Integer> entry:map.entrySet()) {
				if(entry.getValue() > 1) {
				 System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}
			System.out.println();
		}
		//Duplicate numbers	
				public static void duplicateNum(int[] arr) {
					System.out.println("--------------Duplicate Numbers--------------");
										
					Map<Integer, Integer> map=new HashMap<>();
					
					for(Integer num : arr) {
						map.put(num, map.getOrDefault(num, 0)+1);
					}
					for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
						if(entry.getValue() > 1) {
						 System.out.println(entry.getKey() + " : " + entry.getValue());
						}
					}
					System.out.println();
				}
				//Non Duplicate numbers	
				public static void nonduplicateNum(int[] arr) {
					System.out.println("--------------Non Duplicate Numbers--------------");
										
					Map<Integer, Integer> map=new HashMap<>();
					
					for(Integer num : arr) {
						map.put(num, map.getOrDefault(num, 0)+1);
					}
					for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
						if(entry.getValue() == 1) {
						 System.out.println(entry.getKey() + " : " + entry.getValue());
						}
					}
					System.out.println();
				}
				//First Repeated Characters	
				public static void firstRepeatedChar(String str) {
					System.out.println("--------------First Repeated Characters--------------");
									
					Map<Character, Integer> map=new LinkedHashMap<>();
					
					for(char s : str.toLowerCase().toCharArray()) {
						map.put(s, map.getOrDefault(s, 0)+1);
					}
					for(Map.Entry<Character,Integer> entry:map.entrySet()) {
						if(entry.getValue() > 1) {
							System.out.println(entry.getKey() + " : " + entry.getValue());
			                break; 
						}
					}
					System.out.println();
				}
				//First Repeated Characters	
				public static void firstnonRepeatedChar(String str) {
					System.out.println("--------------First Non Repeated Characters--------------");
									
					Map<Character, Integer> map=new LinkedHashMap<>();
					
					for(char s : str.toLowerCase().toCharArray()) {
						map.put(s, map.getOrDefault(s, 0)+1);
					}
					for(Map.Entry<Character,Integer> entry:map.entrySet()) {
						if(entry.getValue() == 1) {
							System.out.println(entry.getKey() + " : " + entry.getValue());
			                break; 
						}
					}
					System.out.println();
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freqCharacters();
		freqWords("Java is platform independent and it is secure and reliable");
		int[] numbers= {2,2,3,4,5,6,4,7,6};
		duplicateNum(numbers);
		nonduplicateNum(numbers);
		firstRepeatedChar("Java is Architecture neutral");
		firstnonRepeatedChar("Java is Architecture neutral");
	}

}
