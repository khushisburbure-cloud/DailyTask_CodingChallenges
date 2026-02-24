package windowProblem;

public class MinSumOfwindow {
//creating a function to write logic that can use later
	public static int MinFromAllWindow(int []arr, int k) {
		int min=Integer.MAX_VALUE;
		 int total =0;
		 
		 for(int i=0;i<k;i++) {
			 total+=arr[i];
		 }
		 min=total;
		 
		 for(int i=k;i<arr.length;i++) {
			 total-=arr[i-k];
			 total+=arr[i]; 
			 
			 if(min>total) {
				 min=total;
			 }
		 }
		 return min;
	}
	
}
//OUTPUT :--4