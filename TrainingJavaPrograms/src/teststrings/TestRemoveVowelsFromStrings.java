package teststrings;

public class TestRemoveVowelsFromStrings {
	public static void removeVowelsFromString(String string) {
	
		
String strNew=		string.replaceAll("[aeiouAEIOU]", " ");
System.out.println(strNew);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
removeVowelsFromString("Anjali java Life Is Fun");
	}



}
