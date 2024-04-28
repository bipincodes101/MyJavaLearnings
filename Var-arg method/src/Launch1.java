//here we learn about var-arg method used for taking multiple argument in only method but same type.
//it also known as ellipse.
class Demo{
	public int display(String... arr) {
		System.out.println("var-arg approach");
		return 0;
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
	System.out.println(	d.display("bipin"));
		d.display("java","data science");
		d.display("devops");
		System.out.println(d.display(args));
		
	}

}
