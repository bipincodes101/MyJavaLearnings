import java.util.HashMap;
import java.util.WeakHashMap;

class Laptop {
	private String companyName;
	private int price;
	Laptop(String companyName,int price){
		this.companyName=companyName;
		this.price=price;
	}
	//getters
	public String toString() {
		return "Lenovo";
	}
}
class Mobile{
	private String companyName;
	private int price;
	@Override
	public String toString() {
		return "Lava";
	}
public void finalize() {
		System.out.println("garbage collector clean the memory");
	}
}
public class GarbageCollectionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Laptop l=new Laptop("lenovo",34000);
//		Mobile m=new Mobile();
//		HashMap h=new HashMap();
//		h.put(l, m);
//		l=null;
//		System.out.println("before garbage collector call");
//		System.out.println(h);
//		System.out.println(" after garbage collector getting called");
//		System.gc();
//		System.out.println(h);
		/*use of WeakHashMap*/
		Laptop l=new Laptop("lenovo",34000);
		Mobile m=new Mobile();
		WeakHashMap h=new WeakHashMap();
		h.put(l, m);
		l=null;
		System.out.println("before garbage collector call");
		System.out.println(h);
		System.out.println(" after garbage collector getting called");
		System.gc();
		System.out.println(h);
	}

}
