class Concept2{
	public void display(int []...arr) {//its 2d take array of array.
		System.out.println(arr);
		for(int []ar:arr) {
			System.out.println(ar);
			for(int element:ar) {
				System.out.println("value is: "+element);
				System.out.println(arr[1][3]);
			}
			System.out.println();
		}
	}
}
public class Launch7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {5,4,3,7,9};
		int []b= {9,0,2,3};
		int []c= {2,3,4};
		Concept2 c2=new Concept2();
		c2.display(a,b);
		System.out.println();
		System.out.println();
		System.out.println();
		c2.display(a,b,c);
		
	}

}
