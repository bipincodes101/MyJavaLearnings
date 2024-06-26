import java.io.File;
//creates the file in current working directory.
public class LaunchFile {

	public static void main(String[] args)throws java.io.IOException {//ducking the exception
		// TODO Auto-generated method stub
		String str="report.txt";
		//it is used that file is present physically or not if available than pointing to that file if not then it create simple java object file
		File f=new File(str);
		System.out.println(f.exists());
		//used for creating new physical file if already available it don't create duplicate its.
		f.createNewFile();
		System.out.println(f.exists());		
	}

}
