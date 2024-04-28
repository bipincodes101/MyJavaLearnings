class Concept1{
	public void display(int[]arr) {
		System.out.println("array argument method");
	}
}
public class Launch6 {

	public static void main(String... args) {//we can replace array[] to var-arg(...) but don't replace var-arg(...) to array([]).
		// TODO Auto-generated method stub
		Concept1 c=new Concept1();
		c.display(new int[]{5,4,4,4,5});//for giving array argument this notation is used. 
	}

}
