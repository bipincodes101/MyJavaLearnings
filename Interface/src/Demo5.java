interface IHarry{
	//in interface methods are by default public and abstract.
	void Serius();
}
class HarryImpl implements IHarry{
	

	@Overrided
	public void Serius() {
		// TODO Auto-generated method stub
		System.out.println("serious black had caught");
	}
class Harmaine implements IHarry{
	@Override
	public void Serius() {
		System.out.println("serious black saved");
	}
  }
class Movie extends Harmaine{
	
   }


public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	IHarry h=new Movie();
	h.Serius();
		
	}

}
