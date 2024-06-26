import java.util.stream.Stream;

public class StreamOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream s=Stream.of(1,2,3,4,5,6,"java");
		s.forEach(System.out::println);
		System.out.println();
		Stream s1=Stream.of("bipin","name");
		s1.forEach(System.out::println);
		System.out.println();
		Integer []arr= {1,2,3,4,56,7};
		Stream s2=Stream.of(arr);
		s2.forEach(System.out::println);
	}

}
