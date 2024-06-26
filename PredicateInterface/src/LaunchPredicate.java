import java.util.function.Predicate;

//because Predicate has only one abstract method so it is functional interface and its lamda expression is possible.
//class MyPredicate implements Predicate<Integer>{ 
//	public boolean test(Integer i) {
//		if(i>7) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//}

public class LaunchPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p=str->str.equals("a");//internally calling test method.
		System.out.println(p.test("a"));
		System.out.println(p.test("c"));
		System.out.println(p.test("c"));
	}

}
