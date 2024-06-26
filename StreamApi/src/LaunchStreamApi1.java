import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LaunchStreamApi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>al=new ArrayList();
		al.add(89);
		al.add(12);
		al.add(85);
		al.add(94);
		al.add(95);
		al.add(46);
		al.add(38);
		al.add(40);
		al.add(40);
		al.add(4);
		al.add(54);
		al.add(58);
		///till jdk 1.7 we use this approach.
		System.out.println("this is original arraylist");
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList();
		for(Integer all:al1) {
			if(all%2==0) {
				System.out.println(al1);
			}
		}
	
		//in jdk 1.8 version we use stream API,s.
		//1. configuration
		//2.processing
		List<Integer> streamLists=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("======================");
		System.out.println(streamLists);
		System.out.println("======================");
		streamLists.forEach(System.out::println);
		
		
	}
	

}
