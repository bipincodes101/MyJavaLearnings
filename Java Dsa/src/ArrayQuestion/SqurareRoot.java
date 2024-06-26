package ArrayQuestion;
import java.util.Scanner;
public class SqurareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int []arr=new int [num+1];
		for(int i=0 ;i<=num;i++) {
			arr[i]=i;
		}
		for(int i=0;i<=num;i++) {
			System.out.print(arr[i] + " ");
		}
		boolean flag=false;
	
		int result1=squareRoot(arr,num,flag);
		System.out.println("ans is  : "+result1);
		
	}
	public static int squareRoot(int []arr,int num,boolean flag) {
		int low=0;
		int high=arr.length-1;
		int result=0;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			int value=mid*mid;
			if(value==num) {
				flag=true;
				return mid;
			}
			else if (value<num) {
				result=mid;//it gives floor value.
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return result;
	}

}
