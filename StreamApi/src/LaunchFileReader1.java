import java.io.*;
public class LaunchFileReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location ="D:\\JavaCodes\\example.txt";
		FileReader f1=new FileReader(location);
		int a=f1.read();
		while (a!=-1) {
			System.out.println((char)a+"->"+a);
			a=f1.read();
			System.out.println("========");
			System.out.println(a);
			System.out.println("========"); 
		}
		
		
	}

}
