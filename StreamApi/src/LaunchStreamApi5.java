import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
public class LaunchStreamApi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		al.add("bipin");
		al.add("nitin");
		al.add("neha");
		al.add("suman");
		al.add("vijay");
		System.out.println(al);
		//using traditional approach.
		System.out.println();
		System.out.println("using traditional approach");
		ArrayList<String>al1=new ArrayList();
		for(String str:al) {
			al1.add(str.toUpperCase());
		}
		System.out.println(al1);
		System.out.println();
		List<String >ll=al.stream().map(obj->obj.toUpperCase()).collect(Collectors.toList());
		System.out.println("using lambda expression");
		System.out.println();
		ll.forEach(i->System.out.println(i));
		System.out.println();
		System.out.println("using method reference");
		ll.forEach(System.out::println);
	}
	

}
