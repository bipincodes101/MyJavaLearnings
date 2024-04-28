class Search{
	void display(int...arr) {//void display(int []arr) are same but not work for given argument.
		System.out.println("var-arg method");
	}
	
}
public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s=new Search();
		s.display(4,4,3,3,3);
	}

}
