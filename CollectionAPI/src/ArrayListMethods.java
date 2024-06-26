//by this program we explore some method of ArrayList.
import java.util.ArrayList;
public class ArrayListMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(89);
		al.add(17);
		al.add("bipin");
		al.add('b');
		al.add(5.5f);
		System.out.println("this is my original array"+al);
// 1.		//contains ()method.
		boolean flag1=al.contains("bipin");
		boolean flag2=al.contains(5.5);//false because it check for double but value is float
		System.out.println(flag1);
		System.out.println(flag2);
	//2.	//indexOf ()method.
		int index1=al.indexOf(5.5f);
		int index2=al.indexOf("bipin");
		System.out.println("index is :"+index1);
		System.out.println("bipin index is "+index2);
	//3.	//ensuresCapacity() method & size() method.
		
		al.ensureCapacity(9);//it is minimum capacity
		int size=al.size();
		System.out.println("size is "+size);
		System.out.println("now actual array is "+al);
	//4.	//trimToSize() method
		al.trimToSize();//trim extra capacity which is not used .
	//5.	//getClass() method.
		Class detailOfClass=al.getClass();
		System.out.println(detailOfClass);//used to know class detail.
	//6.	//clear() method.
		al.clear();
		System.out.println(al);//it clear the data.
		System.out.println(al.size());
		
		
 	}

}
