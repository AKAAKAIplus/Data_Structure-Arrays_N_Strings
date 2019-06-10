import java.util.*;
import java.util.Arrays;

// To check the permutation of String
public class Permutation_And_Palindrome_Checking {
	static String text1 = new String("Level");
	static String text2 = new String("Level");
	static String text3 = new String("Level ");
	static String text4 = new String("Basic");
	
	
	// The implementation following are all considered the " "
	public static void main(String[] args) {
		//Checking the permutation is same or not
		Same_Permutation(text1,text2);
		//Checking the permutation order is same or not
		Permutation_Order(text1,text3);
		//Checking the permutation is belong to palindrome or not
		Palindrome(text1,text2);
	}
	
	private static void Same_Permutation(String str1, String str2) {
		char[] c_str1 = str1.toCharArray();
		char[] c_str2 = str2.toCharArray();
		Arrays.sort(c_str1);
		Arrays.sort(c_str2);
		if( String.copyValueOf(c_str1).equals(String.copyValueOf(c_str2)) ) {
			System.out.println("Both string have same elements!");
		}else {
			System.out.println("Both string have different elements!");
		}
	}
	
	private static void Permutation_Order(String str1, String str2) {
		char[] c_str1 = str1.toCharArray();
		char[] c_str2 = str2.toCharArray();
		if (c_str1.length != c_str2.length) {
			System.out.println("\nBoth string have different order!");
			return;
		}
		
		Arrays.sort(c_str1);
		Arrays.sort(c_str2);
		if( String.copyValueOf(c_str1).equals(String.copyValueOf(c_str2)) ) {
			System.out.println("\nBoth string have same order!");
		}else {
			System.out.println("\nBoth string have different order!");
		}
	}
	
	private static void Palindrome(String str1, String str2) {
		char[] c_str1 = str1.toCharArray();
		char[] c_str2 = str2.toCharArray();
		if (c_str1.length != c_str2.length) {
			System.out.println("\nDifferent Strings! String are not palindrome!");
			return;
		}
		
		for(int i = 0; i < c_str2.length / 2; i++)
		{
		    char temp = c_str2[i];
		    c_str2[i] = c_str2[c_str2.length - i - 1];
		    c_str2[c_str2.length - i - 1] = temp;
		}
		
		if( String.copyValueOf(c_str1).equals(String.copyValueOf(c_str2)) ) {
			System.out.println("\nString are palindrome!");
		}else {
			System.out.println("\nString are not palindrome!");
		}
	}
}
