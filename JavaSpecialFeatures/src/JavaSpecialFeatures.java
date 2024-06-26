//some features are included in java 8 in interface.
interface Book {
	void name();
	int price();
	private void subject() {
		System.out.println("private method called");
	}
	default void pages() {
		System.out.println("default method called");
	}
	static void author() {
		System.out.println("static method is called");
	}
}
class IBook implements Book{
	@Override
	public void name() {
		System.out.println("name is : atomic habits");
	}
	@Override
	public int  price() {
		System.out.println("price is :");
		return 500;
	}
	@Override
	public void pages () {
		System.out.println("page is : 400");
	}
//	@Override
//	public void author() {
//		System.out.println("author is william");//its not overrided
//	}
}
public class JavaSpecialFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBook ib=new IBook();
		ib.name();
		ib.pages();
		Book.author();
		
	}

}
