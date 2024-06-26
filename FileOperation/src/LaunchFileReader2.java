import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class LaunchFileReader2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\JavaCodes\\example.txt");
		FileReader fr=new FileReader(f);
		char[]ch=new char[(int)f.length()];
		//only read one character but store it into char array then we are fetching from char array.
		fr.read(ch);
		for(char data:ch) {
			System.out.print(data);
		}
		//it is good programming practice that close the resource.
		fr.close();//indication that you are closing the resource
	}

}
