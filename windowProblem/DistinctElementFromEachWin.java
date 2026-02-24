package windowProblem;

import java.util.ArrayList;
import java.util.HashMap;
public class DistinctElementFromEachWin {
	public static void main(String[] args) {
		// 10.	Count Distinct Elements in Each Subarray of Size K
//		o	Find the number of distinct elements in each window.
		int arr[]= {7,7,4,5,1,2,2,6,3};
		int k=3;
		DistinctElement(arr,k);	
		UniqueElement(arr,k);
		}
public static int DistinctElement(int []a,int k) {
//
//	for(int i=0;i<=a.length-k;i++) {
//		 int count=0;
//		 for(int j=i;j<i+k;j++) {
//			 while(a[j]!=a[j+i]) {
//				 count++;
//				 j++;
//				 if(a[j]==a[j+i]) {
//					 count--;
//				 }else {
//					 count++;
//				 }
//				 if(a[j]==a[j+i]) {
//					 j++;
//					 if(a[j]==a[j+i]) {
//						 count=0;
//						 System.out.println(0);
//					 }
//				 }
//				 System.out.println(count);
//			 }
//		 }
//	}
//	
	return 0;
}
public static int UniqueElement(int []a, int k) {
	for(int i=0;i<=a.length-k;i++) {
		HashMap<Integer, Integer>freq = new HashMap<>();
		//by building frequency map for each window
for(int j=i;j<i+k;j++) {
	freq.put(a[j], freq.getOrDefault(a[j],0)+1);
}
//count elements that appear exactly once
int count=0;
for(int val:freq.values()) {
	if(val==1) {
		count++;
		
	}
	
}
System.out.print(count+" ");
	}
	return 0;
}
}
//OUTPUT :-1 3 3 3 1 1 3

