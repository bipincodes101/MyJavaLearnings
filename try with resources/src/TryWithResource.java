import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try(String str=new String("bipinpal")){//string  is not implements autoclosable so compile time error.
//			System.out.println(str);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		try(Scanner sc=new Scanner(System.in)){//Scanner class implements autoclosable so no compile time error.
			System.out.println(sc);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
