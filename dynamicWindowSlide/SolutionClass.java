package dynamicWindowSlide;

import java.util.ArrayList;

public class SolutionClass {
//step 1: create function 
	public static ArrayList<String>longestString(String[]a){
		
		//step 2: arraylist to store next result 
		ArrayList<String>result=new ArrayList<>();

		//step 3: forming loop for the starting and ending
//		pointer on starting index 0
		
		for(int i=0;i<a.length;i++) {
//			second pointer on staring 0 as ending 
			 for(int j=0;j<a.length;j++) {
				 if(a.charAt(j)!=result) {
					 result.add(a.charAt(j));
				 }
//step 4: check for the  condition if found in result shrink the window
					 while(a.charAt(j)==result.charAt(i)) {
						 i++;
						 result=result-result.charAt(i);
					 }
				 
			 }
	
		}
		
		//step 5: return
		return result;
	}

}
