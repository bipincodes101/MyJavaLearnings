package in.bipin.main;
import java.io.*;
import java.util.Properties;
public class PropertiesApp {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\JavaCodes\\Launch Jdbc\\src\\in\\bipin\\main\\application.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String userName=p.getProperty("userName");
		String password =p.getProperty("password");
		System.out.println("url is : "+url);
		System.out.println("usr name is : "+userName);
		System.out.println("password is : "+password);
				
	}

}
