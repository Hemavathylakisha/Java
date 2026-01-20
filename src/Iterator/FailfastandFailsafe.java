package Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailfastandFailsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist,linkedlist,hashmap,hashset are fail-fast -throws CME
		List<Integer> list=new CopyOnWriteArrayList<>(); //if we use Copy write Array, concurrenthashmap,  does not throw CME
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator<Integer> i=list.iterator();
		
		while(i.hasNext()) {
			Integer num=i.next();
			if(!(num==50)) {
				list.add(50);
			}
		}
		System.out.println(list);
	}

}
