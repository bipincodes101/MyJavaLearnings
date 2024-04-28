//we can implement any number of interface but we can extends only one class at a time.
interface IRon{
	void fear() ;
}
interface IHarmaine{
	void beauty();
}
interface IHagrid{
	
}
class RonImpl implements IRon,IHarmaine,IHagrid{
	public void fear(){
		System.out.println("ron has fear");
	}
	public void beauty() {
		System.out.println("harmaine is very beautiful");
	}
}
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
