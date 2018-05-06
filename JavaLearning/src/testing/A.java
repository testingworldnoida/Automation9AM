package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {
	 
	public void div() throws FileNotFoundException, NullPointerException {
		
		
		File f =new File("D:\\abc.txt");
		FileReader fr = new FileReader(f);
		
		
		
//		try {
//			int a=10;
//			  int b=0;
//			  int c=a/b;
//			  System.out.println(c);
//			
//		} 
//		 catch (ArithmeticException e) {
//				System.out.println("Exception art message");
//			}
//		catch (Exception e) {
//			System.out.println("Exception message");
//		}
//		finally{
//			System.out.println("finally block");
//		}
//		

	}
	public static void main(String[] args) {
		A o = new A();
		try
		{
		o.div();
		}
		catch(Exception e)
		{
			
		}
		
	}

}
