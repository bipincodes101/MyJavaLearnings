import java.util.Scanner;
public class fibonacciSeries {	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		int []memoryFunction=new int[11];
		for(int i=0;i<=10;i++) {
			memoryFunction[i]=-1;
		}
		int result=fibnacciSeries(memoryFunction,num);
		System.out.println("fibonacci is : "+result);

	}
	public static int fibnacciSeries(int []memoryFunction,int num) {
		if(num<=1) {
			memoryFunction[num]=num;
			return num;
		}else {
			if(memoryFunction[num-2]==-1) {
				memoryFunction[num-2]=fibnacciSeries(memoryFunction,num-2);
			}
			if(memoryFunction[num-1]==-1) {
				memoryFunction[num-1]=fibnacciSeries(memoryFunction,num-1);
			}
		}
		return fibnacciSeries(memoryFunction,num-1)+fibnacciSeries(memoryFunction,num-2); 
	}
	

}
