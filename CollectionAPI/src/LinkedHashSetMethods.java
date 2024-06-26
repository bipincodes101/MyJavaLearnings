import java.util.LinkedHashSet;
public class LinkedHashSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();//it is subpart of HashSet class follow insertion order.
		lhs.add(10);
		lhs.add("bipin");
		lhs.add("20");
		lhs.add(90);
		lhs.add(5);
		lhs.add(-5);
		lhs.add(0);
		System.out.println(lhs);
	}

}
