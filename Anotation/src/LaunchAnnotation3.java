import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.*;
 
//emmiting the annotation.

//@Target(ElementType.LOCAL_VARIABLE)
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.PACKAGE,ElementType.TYPE})
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.Class)
@interface Natural{
	String name() default "banayan";
	int age() default 45;
	String placeOfTree() default "kanpur";
	
}


//@Natural(name="papaya",age=50,placeOfTree="uttar pradesh")
@Natural
class Tree{
	//instance variables
	@Natural
	String name;
	int age;
	
	String placeOfTree;
	//setters and getters
	///setters
	
	public void setName(String name) {
		this.name=name;
	}
	@Natural
	public void setAge(int age) {
		this.age=age;
	}
	public void setplaceOfTree(String placeOfTree) {
		this.placeOfTree=placeOfTree;
	}
	///getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getplaceOfTree() {
		return placeOfTree;
	}
}

public class LaunchAnnotation3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
		
		t.setAge(100);
		t.setName("banayan");
		t.setplaceOfTree("haidrabad");
		System.out.println(t.getAge());
		System.out.println(t.getName());
		System.out.println(t.getplaceOfTree());
		System.out.println(t.getClass());
		System.out.println("===============");
		Class flags=t.getClass();
	Annotation an=flags.getAnnotation(Natural.class);
	Natural n=(Natural)an;
	int age1=n.age();
	System.out.println(age1);
	String nameVar=n.name();
	System.out.println(nameVar);
	String placeVar=n.placeOfTree();
	System.out.println(placeVar);
	}

}
