package windowProblem;

public class FirstNegativeNum {

	public static void main(String[] args) {
		
//9.	First Negative Number in Every Subarray of Size K
//		o	Print the first negative number in each window.
//		o	If none, print 0.
		FirstNegative(new int[] {5,8,7,-9,-1,6,3,-2,7}, 3);

	}
//step 1: create a function
	public static int FirstNegative(int []a,int k) {
		
//		step 2: outer loop for window
		for(int i=0;i<=a.length-k;i++) {
//			flage to declaire if the negative is or not 
			boolean found=false;
//			 step 3: inner loop for window
			for(int j=i;j<i+k;j++) {
//				step 4: condition check 
				if(a[j]<0) {
					System.out.print(a[j]+" ");
					found=true;
					break;
				}
				
			}
			if(!found) {
				System.out.print(0);
			}
			
		}
		return 0;
	}
}
//OUTPUT :- 0 -9 -9 -9 -1 -2 -2
