package FirstProject;
/*
 * in method overloading either argument count or argument data type should be different
 */
public class OverloadingClass {

	public void number(int a) {
		System.out.println("Passed data is: "+ a);
	}
	
	public void number(int a, int b) {
		System.out.println("Passed data is: "+ a +" & "+ b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingClass obj= new OverloadingClass();
		obj.number(1);
		obj.number(2, 3);		
	}

}
