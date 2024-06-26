import java.io.File;
import java.io.IOException;
//creating the file inside a directory.
public class LaunchDirectoryAndFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="Class A";
		File f1=new File(str);
		System.out.println("f1 is a directory : "+f1.isDirectory());
		f1.mkdir();
		System.out.println("directory exits : "+f1.exists());
		File f2=new File(f1,"class a");
		f2.createNewFile();
		System.out.println("file exits : "+f2.exists());
		System.out.println("f2 is a file : "+f2.isFile());
		String str1="Class B";
		f1=new File(str1);
		f1.mkdir();
		System.out.println("directory exists : "+f1.exists());
		f2=new File(f1,"class b");
		f2.createNewFile();
		System.out.println("file exits : "+f2.exists());
	}

}
