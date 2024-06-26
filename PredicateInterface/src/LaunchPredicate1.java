import java.util.function.Predicate;
public class LaunchPredicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <String>p=nums ->nums.length()>6;
		System.out.println(p.test("bipin"));
		System.out.println(p.test("java"));
		System.out.println(p.test("programmar"));
	}

}
