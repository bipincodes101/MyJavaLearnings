import java.util.*;
public class LaunchGenerics4 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(new Integer(20));//this constructor is depricated from java 9 version.
		al.add(null);
//		al.add("java");///can't add string only take Integer.
		badsah(al);
		System.out.println(al);
		ArrayList al5=new ArrayList<Integer>();//it is not -generic.
		al5.add("bipin");//valid because in reference no type parameter is present.
		System.out.println(al5);
		
		ArrayList<Integer> al6=new ArrayList();//this is generic.
		al.add(6);
		al.add("bipinn");//error
	}
	public static void badsah(ArrayList al) {//non-generic method 
		al.add("bipin");
		al.add(null);
	}
}
