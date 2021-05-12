//Reverse a String

public class Lesson1 {

	public static void main(String[] args) {
		
		String a = "Sudhansu";
		String result="";
		
		a.charAt(0);
		a.indexOf("h");
		a.toUpperCase();
		a.replace("n", "m");
		
		 
	
		for(int i=a.length()-1; i>=0; i--) {
			
			result=result+a.charAt(i);			
	
		}

		System.out.println(result.toUpperCase());
	}	
}
