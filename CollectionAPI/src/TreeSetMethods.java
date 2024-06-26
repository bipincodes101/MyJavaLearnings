import java.util.TreeSet;
public class TreeSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(80);
	
		ts.add(30);
		ts.add(40);
	
		ts.add(10);
		ts.add(10);
		System.out.println(ts);
		//1. ceiling method -->used to print same value if present in collection if not give the higher value to value.
		System.out.println(ts.ceiling(30));//30 because 30 is present.
		System.out.println(ts.ceiling(50));//80 because 50 is not present.
		System.out.println(ts.ceiling(90));//null because 90 is not present and neither it highvalue is present .
		//2. floor() method -->give the same value if present if not give lower value.
		System.out.println(ts.floor(30));//30 because it present .
		System.out.println(ts.floor(50));//40 because 50 is not there so give lower value
		System.out.println(ts.floor(5));//null because 5 is not there and its lower is also not there.
		System.out.println(ts.floor(-1));//null
	}

}
