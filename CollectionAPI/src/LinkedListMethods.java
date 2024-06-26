import java.util.LinkedList;
public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(79);
		ll.add(40);
		System.out.println("this is my object : "+ll);
		//1. getFirst() method give the first object.
		Object obj1=ll.getFirst();
		System.out.println("first object is : "+obj1);
		//2.getLast method () give the last object.
		Object obj2=ll.getLast();
		System.out.println("last object is : "+obj2);
		//3. indexOf() method give first index of any object.
		int index1=ll.indexOf(40);
		System.out.println("first index of 40 is :"+index1);
		//4. lastIndexOf() method give the last index of duplicates object.
		int index2=ll.lastIndexOf(40);
		System.out.println("last index of 40 is :"+index2);
		//5.offerFirst () method  may or may not add the object at the front.
		ll.offer("simpleOffer");
		ll.offerFirst("offerFirst");
		ll.offerLast("offerLast");
		System.out.println(ll);
		//6.peekFirst() method fetch the data and not affected the collection means copy the object and give it to you.
		Object peek1=ll.peekFirst();
		System.out.println("first peek is :"+peek1);
		System.out.println("original collection is : "+ll);
		//7.peekLast () method fetch the at the last.
		Object peek2=ll.peekLast();
		System.out.println("peek last is :"+peek2);
		System.out.println("now original collection is :"+ll);
		//8.peek ()method help to fetch the object from collection without affecting the collection at front .
		Object peek3=ll.peek();
		System.out.println("peek is :"+peek3);
		System.out.println("now original collection is :" + ll);
		//9. pollFirst() method it fetch the data from the front   and remove from the collection .
		Object poll1=ll.pollFirst();
		System.out.println("first poll is :"+poll1);
		System.out.println("now original collection is :" + ll);
		//10.pollLast () method it fetch the last object and removed from the collection.
		Object poll2=ll.pollLast();
		System.out.println("last poll is :"+poll2);
		System.out.println("now original collection is :" + ll);
		//11. poll() method it removed data at front .
		Object poll3=ll.poll();
		System.out.println("poll is "+poll3);
		System.out.println("now original collection is :" + ll);
		//12.pop() method used for removing front object to the collection.
		Object pop1=ll.pop();
		System.out.println("pop is here :"+pop1);
		System.out.println("now original collection is :" + ll);
		
		
	}

}
