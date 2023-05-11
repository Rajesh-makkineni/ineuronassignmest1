package strings;

public class unique {

	public static void main(String[] args) {
		
		        String str = "abcdefg";
		        boolean hasUniqueChars = checkUniqueCharacters(str);
		        
		        if (hasUniqueChars) {
		            System.out.println("The string contains all unique characters.");
		        } else {
		            System.out.println("The string does not contain all unique characters.");
		        }
		    }
		    
		    public static boolean checkUniqueCharacters(String str) {
		        boolean[] charSet = new boolean[256];
		        
		        for (int i = 0; i < str.length(); i++) {
		            int charValue = str.charAt(i);
		            
		            if (charSet[charValue]) {
		                return false; 
		            }
		            
		            charSet[charValue] = true;
		        }
		        
		        return true; 
		        
		    }
		

}
