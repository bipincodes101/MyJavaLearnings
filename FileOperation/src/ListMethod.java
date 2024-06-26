import java.io.File;
//list() method show all the files and directories names.
public class ListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dirCount=0;
		int pngFile=0;
		int fileCount=0;
		String location="D:\\JavaCodes";
		File  f=new File(location);
		String[] names=f.list();
		
		for(String name:names) {
			//under this location we search name string object.
			File f1=new File(location,name);
			if(f1.isDirectory()) {
				dirCount++;
				System.out.println("directory : "+name);
			}			
			if(f1.isFile()) {
				if(name.endsWith(".png")) {
					pngFile++;
					System.out.println("this is png file : "+name);
				}
				fileCount++;
				System.out.println("file : "+name);
			}
			System.out.println("-------------------");
		}
		System.out.println("total directory is : "+dirCount);
		System.out.println("total files is : "+fileCount);
		System.out.println("png file is : "+pngFile);
		
		
	}

}
