import java.util.function.Function;
public class ApplyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> f=name -> name.length();
		System.out.println(f.apply("java"));
	}

}
