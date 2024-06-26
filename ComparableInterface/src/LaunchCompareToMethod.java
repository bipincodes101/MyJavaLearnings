import java.util.TreeSet;
public class LaunchCompareToMethod {//it follow Comparable this is default.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();//duplicates are not allowed in TreeSet.
		ts.add("a");
		ts.add("b");
		ts.add("a");
		ts.add("b");
		System.out.println(ts);
		System.out.println("======================");
		/*it is must that that object1 should have object it can't null*/
		System.out.println(("r").compareTo("x"));//-1 because obj1 has come before obj2.
		System.out.println(("b").compareTo("a"));//+1 because obj1 has come after obj2.
		System.out.println(("a").compareTo("a"));//o because both are equal.
		System.out.println(("null").compareTo(null));//because obj2 is null.
	}

}
