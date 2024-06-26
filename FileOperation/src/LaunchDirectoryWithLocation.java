import java.io.File;
import java.io.IOException;
public class LaunchDirectoryWithLocation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="D:\\JavaCodes\\abarakadabra";
		File f=new File(location);
		f.mkdir();
		File f1=new File(f,"abra.txt");
		f1.createNewFile();
	}

}
