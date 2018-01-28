package teststrings;

import java.util.HashMap;

public class TestStrings {
	
	

	public static void findeachCharacterCuntInString(String string) {
		// TODO Auto-generated method stub
	char [] ch=string.toCharArray();
	
	HashMap<Character, Integer>charcount=new HashMap<Character, Integer>();
	for(char c:ch){
		if(charcount.containsKey(c)){
		
		charcount.put(c,charcount.get(c) +1);
		}else{
			
			
			charcount.put(c,1);
			
		}
		
		
	}
	System.out.println(charcount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
findeachCharacterCuntInString("java is A happy language");
	}


}
