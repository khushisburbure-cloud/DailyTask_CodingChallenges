package windowProblem;

public class MaxSumFromAllWindow {

public static void main(String[] args) {
//		1.	Maximum Sum Subarray of Size K
//		o	Find the maximum sum of any contiguous subarray of size k.
//int m = Maxsum(new int[] {-1,5,4,6,-4,3,7,5,-8,9,4},3);
//System.out.print(m);

	MinSumOfwindow s= new MinSumOfwindow();
	int sol=s.MinFromAllWindow(new int[] {1,-2,3,-5,6,4}, 3);
	System.out.print(sol);
	}
	//creating function to write separeae,clear and reusable logic.
	public static int Maxsum(int []arr, int k) {
	//this will check if the array containing negative number will get the maxstart.
		int max=Integer.MIN_VALUE;
//loop for 1st window
		//int max=0;
		int total =0;
		for(int i=0;i<k;i++) {
			 total += arr[i];	
		}
		max=total;
//loop to access multiple windows
			for(int i=k;i<arr.length;i++) {
				total+=arr[i];	
				total-=arr[i-k];
			
//to get the max amonge the windows
				if(max<total) {
					max=total;
				}
				
			}
		
		return max;
	}
}
//OUTPUT :-15