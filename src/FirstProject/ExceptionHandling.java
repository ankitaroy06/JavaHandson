package FirstProject;
/*
 * one try block can be followed by multiple catch blocks
 * no other set of codes should be between these blocks
 * finally block gets executed even the program throws error or not
 * Question: 1 case where finally block will not get executed. Answer: when the program is running and we forcefully stops the JVM, finally block will not get executed.
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5, b=0, k=0;
		try {
			k=a/b;
		}
		catch(Exception e){
			System.out.println("error occured");
		}
		finally{
			System.out.println("Finally block");
		}
		System.out.println(k);
	}

}
