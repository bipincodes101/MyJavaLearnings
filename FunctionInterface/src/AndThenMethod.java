import java.util.function.Function;
public class AndThenMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <Integer,Integer>f1=value-> value+5;
		Function <Integer,Integer>f2=value->value*5;
		Function <Integer,Integer>f3=f2.andThen(f2);
		int result=f3.apply(3);
		System.out.println(result);//first calling Function logic evalute then parameterized.
	}

}
