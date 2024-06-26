import java.util.ArrayList;
public class ToArrayMethod {
	public static void main(String[]args) {
		ArrayList<Integer>al=new ArrayList();
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(8);
		System.out.println("this is your array list: "+al);
		Object []objArr=al.stream().toArray();
		for(Object i:objArr)
		System.out.println("this is array object :"+i);
		System.out.println();
		//array of integer type
		Integer [] intArr=al.stream().toArray(Integer []::new);
		for(int arr1:intArr)
			System.out.println("array integer is : "+arr1);
	}
}
