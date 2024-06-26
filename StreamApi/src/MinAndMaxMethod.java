import java.util.ArrayList;
public class MinAndMaxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String >al=new ArrayList();
		al.add("bipin");
		al.add("nitin");
		al.add("neha");
		al.add("suman");
		al.add("vijay");
		System.out.println("arraylist is : "+al);
		String str=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min is : "+str);
		String str1=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("max is : "+str1);
	}

}
