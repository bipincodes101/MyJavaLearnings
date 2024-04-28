//we can't create the object of abstract class.
interface IBca{//this is an interface.
	//inside interface methods are by default public and abstract.
	//used for achieving 100% abstraction.
	//interface is 100% abstract class.
	void subjects();
	void students();
	
}
 class BcaImpl implements IBca{
	@Override
	public void subjects() {
		System.out.println("there are 6 subjects");
	}
	public void students() {
		System.out.println("there are 50 students");
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBca bi=new BcaImpl();//loose coupling.
		bi.subjects();
		bi.students();
	}

}
