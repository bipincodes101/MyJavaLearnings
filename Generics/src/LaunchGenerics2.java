import java.util.*;

public class LaunchGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<? super Number>ll=new LinkedList<Number>();
		LinkedList<? super Number>l2=new LinkedList<Object>();
		
     //  LinkedList<? super Number>l3=new LinkedList<Integer>();//not compatible
		
		/* for the compatibility generic class compromises*/
		/// it is generic class.
		ArrayList <String >al=new ArrayList<String>();
		al.add("bipin");
		al.add("nitin");
//		al.add(new Integer(10));
		al.add(null);
		show(al);
		System.out.println(al);
	}
	/// it is non-generic method (java 1.4 version).
	public static void show(ArrayList al) {//ArrayList al=new ArrayList<String>();
		al.add(10);
		al.add(8.5);
		al.add("neha");
		al.add("vijay");
		al.add("suman");
	}
}
