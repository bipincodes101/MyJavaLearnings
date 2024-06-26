import java.util.*;
class MyComparator1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String str1=obj1.toString();
		String str2=obj2.toString();
		Integer i1=str1.length();
		Integer i2=str2.length();
		return i1.compareTo(i2);
				
		
	}
}
public class LaunchComparatorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet(new MyComparator1());
		ts.add(" bipin");
		ts.add("bi");
		ts.add("bipi");
		ts.add(new StringBuffer("bipinpal"));
		ts.add(400000000);
		ts.add('z');
		System.out.println(ts);
	}

}
