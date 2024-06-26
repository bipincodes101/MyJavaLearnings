class Test{
	String s;
	Test(String s){
		this.s=s;
		System.out.println("constructor exceuted by - > "+s);
			}
}
interface interf{
	public Test show(String s);
}
public class LaunchConstructrorReference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using lambda expression.
		interf i1=s ->new Test(s);
		i1.show("lamda expression ");
		//using constructor reference i am binding the method.
		interf i2=Test::new;
		i2.show("constructor reference ");
	}

}
