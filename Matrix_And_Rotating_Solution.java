import java.util.Arrays;

// To check if String has repeating character!
public class Matrix_And_Rotating_Solution {
	// We can also set the length as the length of input string to decrease space
	static int[] checking_record = new int[256];
	
	public static void main(String[] args) {
		// Set all record to zero
		Arrays.fill(checking_record, 0);
		
    	// Utilize StringBuilder
		StringBuilder sb = new StringBuilder();
    	String[] words = {"This is the testing string."};
    	
    	for(String word:words) {sb.append(word);}
    	
    	// Set String into char format
    	char[] charArray = new char[sb.length()];
    	sb.getChars(0, sb.length(), charArray, 0);
    	
    	// Detect the ASCII code to check if character repeats
    	for(char each_character:charArray) {
    		int asciicode = (int)each_character;
    		if(checking_record[asciicode] >= 1) {
    			System.out.println(checking_record[asciicode]+" times to repeat:" + (char)asciicode);
    		}
    		checking_record[asciicode] += 1;
    	}
	}
}
