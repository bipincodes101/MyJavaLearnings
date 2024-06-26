//in this we learn about compose method.
import java.util.function.Function;
public class LaunchFunctionInterface1 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1=value1 ->value1*5;;
		Function <Integer,Integer >f2=value2 -> value2+4;
		Function<Integer,Integer> f3=f1.compose(f2);
		int result=f3.apply(6);//first call parameter Function the calling .
		System.out.println(result);
	}

}
