package teststrings;

public class TestString {

	static int a=4;
	
	TestString(int abc){
		
		a=abc;
		
		
	}
	
	public void printValue(){
		System.out.println(a);
		
		
	}
	
	public static void main(String args[]){
		TestString ts=new TestString(5);
		TestString ts1=new TestString(10);
		ts.printValue();
		ts1.printValue();
		//System.out.println();
	}

}
