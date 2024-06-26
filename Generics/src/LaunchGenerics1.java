import java.util.List;
import java.util.ArrayList;
public class LaunchGenerics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList();
		al.add("java");
		al.add("spring boot");
		al.add("spring");
		al.add(10);
//		String st1=al.get(0);type mismatch compile time error
		al.get(1);
		al.get(2);
		al.get(3);
		
		
	}

}
