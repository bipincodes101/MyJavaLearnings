import java.util.ArrayList;//it follows dynamic array data structure.
public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1=new ArrayList();//here homogeneous data is stored.
		al1.add(89);
		al1.add(17);
		al1.add(85);
		al1.add(91);
		al1.add(95);
		System.out.println(al1);
		System.out.println("===============");
		ArrayList al2=new ArrayList();//here hetrogenous data is stored.
		al2.add(89);
		al2.add("bipin");
		al2.add('b');
		al2.add(null);
		al2.add(true);
		al2.add(0);
		System.out.println(al2);
		System.out.println("===============");
		ArrayList al3=new ArrayList();//here we add entire collection into new collection
		al3.addAll(al2);
		al3.addAll(al1);
		System.out.println(al3);
		System.out.println("===============");
		ArrayList al4=new ArrayList();
		al4.add(0,5);
		System.out.println("element add at the front "+al4);
//		al4.add(5,55);//here IndexOutOfBoundsException: Index: 5, Size: 1 because ArrayList is shrinked 
		al4.add(65);
		al4.add(1,44);
		System.out.println("element add at index 1 "+al4);
		System.out.println("element add at the middle"+al4);
		al4.add(66);
		System.out.println("element add at the rear"+al4);
		/*conclusion --> in ArrayList we can add the at the middle and front but it is not recommened because adding is done by shifting the object so it is little bit time consuming*/
		
	}

}
