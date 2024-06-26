import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator{
	public int compare( Object obj1,Object obj2){
		Integer value1=(Integer)obj1;
		Integer value2=(Integer)obj2;
		//if wants to ascending.
//		return value1.compareTo(value2);
		//if wants descending.
		
		if(value1<value2) {
			return +1;
		}else if(value1>value2) {
			return -1;
		}else {
			return 0;
		}
		
		//another way of descending
//		return -value1.compareTo(value2);
		
		//if you want in inserting order.
//		return +1;
		
		//only root node give
//		return 0;
		
		
	}
}
public class LaunchComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> ts=new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(20);
		ts.add(5);
		ts.add(30);
		ts.add(20);
		System.out.println(ts);
	}

}
