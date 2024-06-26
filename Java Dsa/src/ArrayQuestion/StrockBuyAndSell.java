package ArrayQuestion;

public class StrockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []arr= {7,9,5,6,4,8,9,4,5,6,4,67,75,7};
		int []arr= {7,6,5,4,3,0,2,1,5};
		
		
//		int result=stock(arr);
//		
//			System.out.println("profit is : "+result);
//		
//		
//		
//  }
//	public static int stock(int []arr) {
//		int container=0;
//		int cont=0;
//		int profit=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					
//					 cont=arr[j]-arr[i];
//					 if(container<cont) {
//					 profit=cont;
//					 container=profit;
//					 }
//				}
//				
//			}
//			
//		}
//		return profit;
		
	System.out.println(profit(arr));
	}
	public static int profit(int []arr) {
		int buyPrice=arr[0];
		int currentProfit=0;
		int maxProfit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<buyPrice) {
				buyPrice=arr[i];
			}
			currentProfit=arr[i]-buyPrice;
			if(currentProfit>maxProfit) {
				maxProfit=currentProfit;
			}
			
		}
		return maxProfit;
	}
}
