package FirstProject;
/*
 * this keyword refers to object of the class
 * suppose in this program class level variable is a, which is changing the value inside a method. We need the value of class level value as well. In that case, we will use 'this' keyword to refer the class level variable a
 */
public class ThisClass {
	
	int a=10;
	
	public void data() {
		int a=20;
		System.out.println("Value of local 'a' variable = "+ a );
		System.out.println("Value of class 'a' variable = "+ this.a );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisClass obj= new ThisClass();
		obj.data();
		
	}

}
