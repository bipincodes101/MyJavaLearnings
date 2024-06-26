import java.util.LinkedList;//it follows doubly linked list data structure.
public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll1=new LinkedList();
		ll1.add(89);
		ll1.add("aditya");
		ll1.add("java");
		ll1.add(78);
		System.out.println(ll1);
		ll1.add(0,67);
		System.out.println(ll1);
		ll1.addFirst("first");
		System.out.println(ll1);
		ll1.addLast("last");
		System.out.println(ll1);
	}

}
