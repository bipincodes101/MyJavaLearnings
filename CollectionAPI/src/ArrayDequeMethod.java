import java.util.ArrayDeque;
public class ArrayDequeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(40);
		System.out.println(ad);
		ad.addFirst("first");
		ad.addLast("last");
		System.out.println(ad);
	}

}
