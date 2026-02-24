package windowProblem;

import java.util.ArrayList;

public class MaxSolution {
//	6.	Maximum Element in Every Subarray of Size K
//	Print the maximum element from each window of size k.

//	step 1: creating function 
	public static ArrayList<Integer>MaxfromEachWin(int []arr, int k){
		
//		step 2: create arraylist
		ArrayList<Integer>result=new ArrayList<>();
		
//		step 3: process window 1
		
		for(int i=0;i<=arr.length-k;i++) {
			int max=arr[i];
			
//		step 4: process window slide 
			for(int j=i+1;j<i+k;j++) {
				if(max<arr[j]) {
					max=arr[j];
				}		
			}
			result.add(max);
		}
		return result;
	}
public static void main(String []args) {
	int []arr= {1,2,5,-4,3,7,-8,1};
	int k=4;
	ArrayList<Integer>result=MaxfromEachWin(arr,k);
	
//		step 5: print it 
	System.out.println(result);
}

}
//OUTPUT :-[5,5,7,7,7]
