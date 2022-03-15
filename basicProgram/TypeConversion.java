package basicProgram;

public class TypeConversion {

	public static void main(String[] args) {
	    
		char ch ='a';
		int i =ch;  // implicit Conversion(Made by system)
		ch = (char)i; //Explicit Conversion(Made by user)
		ch = (char)(ch+1);
		
		System.out.println(i);
		System.out.println(ch);
		
		
//		short s = 17;
//		int j = s;
//		s = (short)j;
		
		  
//		int k = (int)17.5;
//		System.out.println(k);
		
		
		
		//all decimal value is double byDefault so we need to convert them into float.
//		 float f = 1.3f;
		
	}

}
