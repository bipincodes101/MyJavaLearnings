import java.util.Comparator;
import java.util.TreeSet;
class MyComparatorExample implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Character value1=(Character)obj1;
		Character value2=(Character)obj2;
		return -value1.compareTo(value2);
	}
}
public class LaunchComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Character>  ts=new TreeSet(new MyComparatorExample());
		ts.add('a');
		ts.add('a');
		ts.add('o');
		ts.add('t');
		ts.add('y');
		ts.add('z');
		ts.add('c');
		System.out.println(ts);
	}

}
