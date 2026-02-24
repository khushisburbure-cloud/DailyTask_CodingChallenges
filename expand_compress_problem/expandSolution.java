package expand_compress_problem;

public class expandSolution {
//Write a function to expand a pattern string containing numbers and characters.
	public static String ExpandTheString(String s) {
		String result ="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);	//read charachter
			i++;		//increament position of i
			int count = s.charAt(i)-'0'; 	//read increamented i convert digit into int e.g '2'-'0'=2
		
		//for loop to get char into counted time
		for(int j=0;j<count;j++) {		//append charachter till count-1
			result += ch;	//stores result
		}
		}
		return result; 		//return result
	}
	
}
