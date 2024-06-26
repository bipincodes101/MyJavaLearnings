//Collections is an individual class present in class framework.
import java.util.*;
public class CollectionsIndividualClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(60);
		ar.add(40);
		ar.add(30);
		ar.add(50);
		ar.add(30);
		System.out.println("without sorted :"+ar);
		Collections.sort(ar);
		System.out.println("sorted :"+ar);
		int i=Collections.binarySearch(ar, 30);
		System.out.println(i);
		 Collections.shuffle(ar);
		 System.out.println(ar);
		System.out.println( "max is "+Collections.max(ar));
		System.out.println(Collections.frequency(ar, 30));
	
	}

}
