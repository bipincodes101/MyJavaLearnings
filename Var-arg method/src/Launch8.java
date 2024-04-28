class Concept3{
	public void display(int [][]...arr) {
		for(int [][]ar:arr) {
			for(int [] a:ar){
				for(int element:a) {
					System.out.println(element);
				}
			}
			
		}
		System.out.println(arr[1][0][1]);
		System.out.println(arr[2][0][2]);
		System.out.println(arr[1][0][3]);
		
	}
}
public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{5,5,4,4}};
		int [][]b= {{4,5,6,4}};
		int [][]c={ {4,2,3,5}};
		Concept3 c3=new Concept3();
		c3.display(a,b,c);
	}

}
