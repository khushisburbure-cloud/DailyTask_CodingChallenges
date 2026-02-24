package expand_compress_problem;
//THIS CODE IS NOT CORRECT FLOW
public class compressSolution3 {
//Write a function to compress consecutive characters but ignore case sensitivity (treat A and a as same).
	
	//creating a function to write logic 
	public static String CompressStringEgnoringCase(String s) {
		//create empty string to store result
		String result ="";
		int count=1;
		//normalising the string 
		String str = s.toLowerCase();
		
		//logic
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				result=result+str.charAt(i)+count;
				count++;
			}
			result=result + str.charAt(i) + count;
			count=1;
		}
		return result;
	}
	
	
}
