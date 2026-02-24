package expand_compress_problem;

public class compress_solution {
	public static void main(String[]args) {
//	String compress=appendcharandCount("aaaaabbbbbbbtttttttrrrrrrdddddddSSSSSSPPPPPP");	//calling function 
//	System.out.print(compress +"");
		compressSolution so=new compressSolution();
	//String s=so.removeDuplicate("kkkkhhheeerrrrggg");
	//System.out.print(s);
	
	expandSolution sol=new expandSolution();
	String s=sol.ExpandTheString("k2h3n4g6");
	System.out.print(s);
			
	}
	


//writing a function to compress the input string 
	//main logic current and next index element comparission.
public static String  appendcharandCount(String s) {
	int count =1;
	String result = "";
	for(int i=0;i<s.length();i++) {
		if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) {
			count++;
		
		}
		
		else {
			result = result + s.charAt(i)+count;
			
			count =1;
		}
	}
	return result;
}

}
