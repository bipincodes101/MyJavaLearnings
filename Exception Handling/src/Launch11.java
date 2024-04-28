class House{
	int show() {
		try {
			System.out.println("program is begin");
			return 10;
		}
		
		finally {
			System.out.println("program is ended");
		}
		
	}
}
public class Launch11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h=new House();
		h.show();
	}

}
