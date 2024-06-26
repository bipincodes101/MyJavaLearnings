//we can access objects by the for each loop in any class.
import java.util.*;
public class AccessingTheElementFromCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(60);
		al.add(30);
		al.add(20);
		al.add(10);
		System.out.println(al);
		//ways to accessing data 
		//1.via index
		//accessing the data from collection
		for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
		}
		System.out.println("==================");
		//2.via iterator.
		Iterator i=al.iterator();//activating the iterator.
		while(i.hasNext()) {//check the value is present or not on block
			System.out.println(i.next());//fetch the value.
		}
		System.out.println("==================");
		//3.ListIterator -->used to fetch the objects in reverse order from the collection./// It is available on only list DS (ArrayList and LinkedList).
		ListIterator li=al.listIterator(al.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			
			//how to reverse without list DS.
			
		}
		ArrayDeque ad=new ArrayDeque();
		ad.add(20);
		ad.add("bipin");
		ad.add(60);
		ad.add(70);
		for(Object obj:ad) {
			System.out.println("all elements by for each loop :"+obj);
			}
		System.out.println("original is :"+ad);
		LinkedList ll=new LinkedList();
		ll.addAll(ad);
		ListIterator it2=ll.listIterator(ad.size());
		while(it2.hasPrevious()) {
			System.out.println("reverse is "+it2.previous());
		}
		//descending Iterator() is available on TreeSet ,LinkedList and ArrayDeque.
		ArrayDeque ad3=new ArrayDeque();
		ad3.add(56);
		ad3.add("bipin");
		ad3.add(45);
		ad3.add(89);
		ad3.add(89);
		Iterator itr4=ad3.descendingIterator();
		while(itr4.hasNext()) {
			System.out.println("accessing the object via descendingIterator(): "+itr4.next());
			
		}
		
	}

}
