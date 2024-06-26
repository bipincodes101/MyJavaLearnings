import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class LaunchFileReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File f=new File("example.txt");
//		f.createNewFile();
		FileReader fr1=new FileReader("example.txt");
		int i=fr1.read();
		System.out.println((char)i);
		System.out.println(i);
		while(i!=-1) {
			System.out.println(i);
			i=fr1.read();
		}
			
	}

}
