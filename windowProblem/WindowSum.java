package windowProblem;

import java.util.ArrayList;

public class WindowSum {
//	4.	Sum of All Subarrays of Size K
//	o	Print the sum of each fixed-size subarray

//  step 1: create function
	public static ArrayList<Integer>EachWinSum(int[]array, int k){
		//arraulist
		ArrayList<Integer>sum=new ArrayList<>();
		
//		step 2: process for window 1
		int total=0;
		for(int i=0; i<k; i++) {
			total+=array[i];
		}
		sum.add((Integer)total);
		
//		step 3: process sliding window
		for(int i=k;i<array.length;i++) {
			total-=array[i-k];
			total+=array[i];
			sum.add((Integer)total);
		}
		
//		step 4: print the sum
		return sum;
		
	}
public static void main(String []arg) {
	int []array= {1,2,5,4,6,7,8,9};
	int k=5;
	ArrayList<Integer>sum=EachWinSum(array,k);
	System.out.print(" "+sum+" ");
}


}
