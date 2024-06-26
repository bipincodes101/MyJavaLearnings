import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class SortedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList();
		al.add(0);
		al.add(89);
		al.add(17);
		al.add(85);
		al.add(91);
		al.add(2);
		al.add(4);
		al.add(1);
		al.add(76);
		System.out.println("before sorting : "+al);
		System.out.println();
		//sorted() method is used.
		//internally sorted method is used Comparable interface and  call compareTo() method.
		List <Integer>l= al.stream().sorted().collect(Collectors.toList());
		System.out.println("after sorting "+l);
		System.out.println();
		//internally use Comparator interface  and  use compare() method.
		List<Integer>l1=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("reverse order sorting: "+l1);
		
	}

}
