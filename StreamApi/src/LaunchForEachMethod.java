//public void forEach(java.util.function.Consumer<? super E>);
/* C:\Users\Bipin>javap java.util.function.Consumer
Compiled from "Consumer.java"
public interface java.util.function.Consumer<T> {
  public abstract void accept(T);
  public default java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T>);
}
*/
import java.util.ArrayList;
import java.util.function.Consumer;;
class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String name) {//automatically called when passing the My
		//Consumer object reference.
		System.out.println("i am accept method responsible for printing the name :");
		System.out.println(name);
	}
}
public class LaunchForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String >name=new ArrayList<>();
		name.add("mohan");
		name.add("sohan");
		name.add("rohan");
		name.add("brijesh");
		name.add("kamlesh");
		name.forEach(System.out :: println);//using method reference
		System.out.println("============");
		name.forEach(names -> System.out.println(names));//lamda expression
		Consumer<String> mc=new MyConsumer();//traditional approach
		name.forEach(mc);
		
	}

}
