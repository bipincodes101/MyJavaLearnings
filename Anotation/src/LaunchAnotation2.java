//in this program we learn that how to built your own annotation.
/* whenever we great own annotation we use two concept 
 * first must specify the target and second retention policy*/
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ElectronicsAccesories{//it is multivalue interface
	//@ meTYPEns annotation not an interface.
	/// we give the value of vaiables in two ways 
	/*
	String name() default "India";//this is first way.
	int number () default 4000;
	*/
	public String name();
	public int number();
	int a=0;
	
}
@ElectronicsAccesories(name="bipin",number=98)
class Laptop{
	
}
public class LaunchAnotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
