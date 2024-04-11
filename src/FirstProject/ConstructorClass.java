package FirstProject;

public class ConstructorClass {
/*
 * it will never return any value like methods will do
 * it should be always same name as of the Class
 * whenever we create any object of the class, the set of lines inside the constructors will get executed.
 * but if any type of constructors is already defined then java will not implicitly call any constructors.
 * if we have not defined any constructor block, the compiler will implicitly call a default constructor
 * class can have more than 1 constructor but the parameter data type or the number of arguments should vary.
 * there are 2 types of constructors: default constructors- it will not accept any values; parameterized constructors: It will accept some value and also initialize them to global variables
 */
	
	public ConstructorClass() {
		System.out.println("Default constructor block");
		System.out.println();
	}
	
	public ConstructorClass(int a, int b) {
		System.out.println("Parameterized constructor block 1");
		System.out.println("Data in the constructor : "+ a +", "+ b);
		System.out.println();
	}
	public ConstructorClass(String name) {
		System.out.println("Parameterized constructor block 2");
		System.out.println("Data in the constructor : "+ name);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorClass obj1 = new ConstructorClass();
		ConstructorClass obj2 = new ConstructorClass(1,2);
		ConstructorClass obj3 = new ConstructorClass("hello");
	}

}
