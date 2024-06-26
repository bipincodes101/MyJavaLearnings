import java.util.HashMap;
import java.util.Map;
class Bottle{
	private  String companyName;
	private int price;
	Bottle(String companyName,int price){
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
		System.out.println("garbeg collector collected this object ");
	}
}
public class LaunchGarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bottle b=new Bottle("sigma ",150);//this object is ready for garbage collecting because no reference is referring to this.
		HashMap h=new HashMap();
		h.put(b, "java");
		b.companyName();
		b.price();
		b=null;
		System.gc();
		System.out.println("last line");
		/*conclusion :-  HashMap dominate the garbage collectio so we used WeakHashMap .*/
	}

}
