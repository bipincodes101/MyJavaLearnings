import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
public class CountMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList();
		al.add("bipin");
		al.add("nitin");
		al.add("neha");
		al.add("sumanpal");
		al.add("vijay pal");
		al.add("krishna");
		al.add("ramayan");
		al.add("valmiki");
		al.add("tulsidas");
		System.out.println(al);
		
		List<String>l=al.stream().filter(obj->obj.length()>5).collect(Collectors.toList());
		System.out.println(l.size());
		System.out.println();
	//count method (this is best approach to count objects).
	long countVar=	al.stream().filter(obj->obj.length()>5).count();
	System.out.println(countVar);
	}

}
