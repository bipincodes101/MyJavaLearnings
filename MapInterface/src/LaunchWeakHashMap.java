/*WeakHashMap class not dominate the Garbage collector*/
import java.util.Map;
import java.util.*;
class Car{
	private  String companyName;
	private int price;
	Car(String companyName,int price){
		this.companyName=companyName;
		this.price=price;
	}
	public String companyName() {
		return companyName;
	}
	public int price() {
		return price;
	}
	@Override
	public void finalize() {
		System.out.println("garbage collector collected this object ");
	}
}
public class LaunchWeakHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("tata ",50000);
		WeakHashMap whm=new WeakHashMap();
		whm.put(c,"my car");
		c=null;
		System.gc();
		System.out.println("last line");
		
	}

}
