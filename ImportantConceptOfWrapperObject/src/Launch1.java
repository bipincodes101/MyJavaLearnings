
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=20;
		Integer j=20;
		System.out.println(i==j);//true
		Integer a=50;
		Integer b=50;
		System.out.println(a==b);//true
		Integer m=130;
		Integer n=130;
		System.out.println(m==n);//false
		//direct literals searching in buffer first.
		//it is for direct literals.
		//see in copy important wrapper object it maintaion the wrapper object which range is -128 to 127.
	}

}
