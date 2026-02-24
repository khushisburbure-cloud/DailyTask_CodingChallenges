package windowProblem;

import java.util.ArrayList;

public class AverageSum {
	//3.	Average of All Subarrays of Size K
	//o	Print the average of every subarray of size k.

  //creating function 
	public static ArrayList<Double>AveSumOfWin(int []a, int k) {
		//creating new list array to store result average of each window
//		step 1:create empty arraylist of type double to store result of avg of each window
		ArrayList<Double>result=new ArrayList<>();
		int total =0;
		
//		step 2: process to get total from window 1
		//find one window
		for(int i=0;i<k;i++) {
			total+=a[i];
			//avg = total/k;
		}
//		step 3: avg is store in the ressult arraylist
		result.add((double)total/k);
		
//		step 4: process other window and store avg in result
		for(int i=k;i<a.length;i++)
		{
			total-=a[i-k];
			total+=a[i];
			
			result.add((double)total/k);
		}
//		step 5: return resultant avg from each window
		return result ;
	}
	public static void main(String []args) {
		int []a= {2,-3,4,-1,5,6,2};
		int k=4;
		ArrayList<Double>result=AveSumOfWin(a,k);
		System.out.print(" " +result+" ");
	}
	
}
//OUTPUT :- [0.5,1.25,3.5,3.0]
