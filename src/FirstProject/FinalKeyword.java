package FirstProject;
/*
 * if we declare any variable as final, we can't change the value of that keyword
 * if we declare any method as final, then we can't override the method in the child class
 * if we declare any class name as "final" then we can't extend that class
 */
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=10; // here declared the variable as final
		a=20; // now if trying to change here, we are getting error
	}

}
