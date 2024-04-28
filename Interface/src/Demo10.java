interface IElectronics{
	void volume() ;
}
interface IElectricals{
	public int volume();
}
class BudsImpl implements IElectrical ,IElectronics{
	public void volume() {//we can't implement same method signature with different return type.
		
	};
	public int volume() {
		
	}
}
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
