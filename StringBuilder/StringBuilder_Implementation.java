package StringBuilder;

import java.lang.StringBuilder;

public class StringBuilder_Implementation {
	public static void main(String[] args) {
    	//Utilize StringBuilder
		StringBuilder sb = new StringBuilder();
    	String[] words = {"Cheese", "Pepperoni", "Black Olives"};
    	
    	for(String word:words) {
    		System.out.println("Appending:"+word);
    		sb.append(word);
    	}
    	System.out.println(sb.toString());
    	System.out.println("------");
    	System.out.println(sb.indexOf("Pepperoni"));
    	System.out.println(sb.reverse().toString());
	}
}
