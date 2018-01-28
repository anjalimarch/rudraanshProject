package teststrings;

public class CountNumOfWordsInString {


	private static void countNumOfWordsString(String inputstring) {
		// TODO Auto-generated method stub
		
	/*	int count=1;
		
		for(int i=0;i<inputstring.length()-1;i++){
			
			if(inputstring.charAt(i)==' ' && inputstring.charAt(i+1)!=' '){
				
				count++;
			}
			System.out.println(count);
		}*/
		String [] stringArray=inputstring.split(" ");
		int count=stringArray.length;
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 countNumOfWordsString("java is funny language");
	}


}
