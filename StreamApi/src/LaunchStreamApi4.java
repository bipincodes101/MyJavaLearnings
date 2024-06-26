import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.List;

public class LaunchStreamApi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList();
		ll.add("bipin");
		ll.add("nitin");
		ll.add("neha");
		ll.add("suman");
		ll.add("vijay");
		ll.add("bhanu");
		ll.add("mamta");
		ll.add("rajendra");
		ll.add("sapna");
		System.out.println("===========================");
		System.out.println("this is original arraylist");
		System.out.println();
		System.out.println(ll);
		System.out.println("===========================");

		// modify the linked list objects and store into another linked list;
		/// this is traditional approach to accessing the object.
		///till jdk1.7 version.
		LinkedList<String> ll1 = new LinkedList<String>();
		for (String str : ll) {
			ll1.add(str + " pal");
		}
		System.out.println("using traidional approach");
		System.out.println();
		System.out.println(ll1);
		System.out.println("===========================");
		//from jdk 1.8 version.
		// using lambda expression.
		List<String> l = ll.stream().map(obj -> obj + " pal").collect(Collectors.toList());
		System.out.println("using lambda expression");
		System.out.println();
		l.forEach(i->System.out.println(i));
		System.out.println("==============================");
		
		//using method reference.
		System.out.println("using method reference");
		System.out.println();
		l.forEach(System.out::println);
		System.out.println("==============================");

	}

}
