import java.io.File;
public class LaunchDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryName="certificate";
		File f=new File(directoryName);
		System.out.println(f.exists());
		f.mkdir();//for creating new directory if exist don't create.
		System.out.println(f.exists());
	}

}
