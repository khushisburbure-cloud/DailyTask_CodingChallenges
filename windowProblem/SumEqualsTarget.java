package windowProblem;

public class SumEqualsTarget {

	public static void main (String []args) {
//5.	Count Subarrays with Sum Equal to K
//		o	Count how many subarrays of size k have sum equal to a given value.
int s=WinSumEqualsToTargetCount(new int[] {7,8,9,5,4,1,1,2,2},3,10);
System.out.print(s);
	}
//	step 1: create function 
	public static int WinSumEqualsToTargetCount(int []arr, int k,int target) {
		
//		step 2: process for window 1
		int count=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		if(sum==target) {
			count++;
		}	
//		step 3: process for sliding windows
		for(int i=k;i<arr.length;i++) {
			sum-=arr[i-k];
			sum+=arr[i];
			if(sum==target) {
				count++;	
			}
			
		}
		return count;	
	}
}
