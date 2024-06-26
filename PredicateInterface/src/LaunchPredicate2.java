import java.util.function.Predicate;
public class LaunchPredicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,5,6,7,8,9,10};
		Predicate <Integer>p1=i -> i>6;
		System.out.println("this is greater logic : ");
		compareMethod(p1,arr);
		Predicate <Integer>p2=i -> i%2==0;
		System.out.println("this is even check logic : ");
		compareMethod(p2,arr);
		Predicate <Integer> p3=i -> i%3==0;
		System.out.println("this is divided by 2 logic : ");
		compareMethod(p3,arr);
		
		///instead of writing operator we use and() method .
//		Predicate <Integer>p4= i-> i>6 && i%2==0;
//		System.out.println("number which are greater then 6 and divisble by 2 :");
//		compareMethod(p4,arr);
		System.out.println("number which are greater and even both: ");
		compareMethod(p1.and(p2),arr);
		System.out.println("number which are divisble by 3 or also 2");
		compareMethod(p2.or(p3),arr);
		System.out.println("which are not divisble by 2");
		compareMethod(p2.negate(),arr);
		System.out.println("number present inside array or not :");
		compareMethod(Predicate.isEqual(5),arr);//number present inside array or not if present print that number.
		System.out.println("which is not divisible by 2");
		compareMethod(Predicate.not(p2),arr);
	}
	private static  void  compareMethod(Predicate<Integer> p1, int[] arr) {
		for(int element:arr) {
			if(p1.test(element)) {
				System.out.println(element);
			}
		}
		
	}

}
