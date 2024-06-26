import java.util.function.Function;
public class IdentityMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer>f=value->value+56;
		System.out.println(Function.identity());
	}

}
