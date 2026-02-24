package windowProblem;

import java.util.ArrayList;

public class CountEven {

	public static void main(String[] args) {
//		8.	Count of Even Numbers in Each Subarray of Size K
//		o	For each window, count how many even numbers exist.
 
// step 1: create arrylist	
//		step 2; initialise counter
//		step 3: process window
//		step 4: count evenno.
//		step 5: reset count to 0
//		step 6: return
		int []a= {4,8,7,5,5,2,3,3};
		int k=3;
		ArrayList<Integer>countOfEven=CountEvenNoFromEachWindow(a,k);
		System.out.print(" "+countOfEven+" ");
	}
	public static ArrayList<Integer>CountEvenNoFromEachWindow(int []a, int k){
		  ArrayList<Integer>countOfEven=new ArrayList<>();
		  int count=0;
		for(int i=0;i<=a.length-k;i++) {
			count=0;
			for(int j=0;j<k;j++) {
				
				if(a[i+j]%2==0) {
					//i=0;a[0+0]=a[0]=4
					//i=0;a[0+1]=a[1]=8
					//i=0;a[0+2]=a[2]=7
					count++;	
				}
			}
				countOfEven.add(count);
		}
	return countOfEven;
	}
}
//OUTPUT :-[2,1,0,1,1,1]
