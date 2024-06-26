import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
public class SortedMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList();
		al.add("ram");
		al.add("seeta");
		al.add("bajranbali");
		al.add("yudhister");
		al.add("arjun");
		al.add("barjun");
		al.add("base");
		al.add("ace");
		al.add("aae");
		System.out.println("before sorting: "+al);
		//sorting will happen here.
		System.out.println();
		List<String>l=al.stream().sorted().collect(Collectors.toList());
		System.out.println("after sorting : "+l);
		System.out.println();
		List<String>l1=al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("reverse sorting"+l1);
	}

}
