package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if(input.equals(" ")) {
			return "Hello, my friend".trim();
		}
		
		else if(input.equals(input.toUpperCase())) {
			return "HELLO, "+input.trim();
		}
		else{
	
		String cap=input.substring(0,1).toUpperCase()+input.substring(1);
		
		 return "Hello, "+ cap.trim();
		}
		
		
	}
	
		
}
