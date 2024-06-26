import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
public class LaunchStreamApi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(0);
		al.add(4);
		al.add(5);
		al.add(3);
		al.add(7);
		al.add(21);
		al.add(30);
		System.out.println("original array list");
		System.out.println(al);
		System.out.println("===========================");
	//traditional approach.
		System.out.println("using traditional approach");
		ArrayList<Integer>al2=new ArrayList<Integer>();
		for(Integer all2:al) {
			al2.add(all2*3);	
		}
		System.out.println(al2);
		System.out.println("===========================");
		System.out.println();
		//using lambda expression.
		//for every object there is new object so map is used.
		System.out.println("using lambda expression");
		System.out.println();
		List<Integer>l=al.stream().map(obj->obj*3).collect(Collectors.toList());
		System.out.println("this is simple arraylist");
		System.out.println(l);
		System.out.println("=============================");
		System.out.println("***************************");
		System.out.println("printing as a list");
		l.forEach(a->System.out.println(a));
		System.out.println("=============================");
		
		//using method reference.
		System.out.println("using method reference");
		l.forEach(System.out:: println);
		
		
	}

}
