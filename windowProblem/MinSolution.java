package windowProblem;

import java.util.ArrayList;

public class MinSolution {

	public static void main(String[] args) {
		int a[]= {7,-8,9,-4,5,6,1,2,-3};
		int k=3;
		ArrayList<Integer>minvalue=MinfromEachWindow(a,k);
		System.out.println(minvalue);

	}
//	step 1: create function
	public static ArrayList<Integer>MinfromEachWindow(int []a,int k){
		
//		step 2: arraylist to store resultant min value from each  window
		ArrayList<Integer>minvalue=new ArrayList<>();
		
//		step 3: process windows 
		for(int i=0;i<=a.length-k;i++) {
			int min=a[i];
			
//		step 3: process windows 
			for(int j=i+1; j<i+k;j++) {
				min=Math.min(min,a[j]);
			}
			minvalue.add(min);
		}
//		step 4: rerurn 

		return  minvalue;
	}
}
//OUTPUT :-[-8,-8,-4,-4,1,1,-3]