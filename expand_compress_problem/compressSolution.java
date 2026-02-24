package expand_compress_problem;

public class compressSolution {
//	Write a function to compress a string by removing consecutive duplicates (only keep one occurrence).
	//logic reverse comparission 
	public static String removeDuplicate(String s) {
		String result = "";
		
		for(int i=0;i<s.length()-1;i++) {
			if(i==0|| s.charAt(i)!=s.charAt(i-1)) { 	//check previous index element and current 
				result += s.charAt(i);
			}
			
		}
		return result;
	}
}
