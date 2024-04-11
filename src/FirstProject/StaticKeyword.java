package FirstProject;
/*
 * whenever we declare any instance variable as static, that variable is shared throughout the program
 * all static variables are instance variables
 * static methods/variables are object independent
 * static methods will only accept the static variables
 * we can also maintain a static block for initializing static variables
 */
public class StaticKeyword {
	String name; //instance variable
	int roll; //instance variable
	static String school="XYZ"; //class variable
	static int count=0; //class variable
	
	/*
	 * Static block:
	 * static{
	 * 	school= "XYZ";
	 * 	count=0;
	 * }
	 */
	public StaticKeyword(String name, int roll) {
		this.name=name;
		this.roll=roll;
		count++;
	}
	
	public static void totalStudents() {
		System.out.println("Total number of students : "+ count);//accepting only static variables
	}
	public void studentData() {
		System.out.println("Name: "+ name);
		System.out.println("Roll: "+ roll);
		System.out.println("School: "+ school);	
		System.out.println();
	}
	
	public static void main(String args[]) {
		StaticKeyword obj= new StaticKeyword("A", 1);
		StaticKeyword obj1= new StaticKeyword("B", 2);
		StaticKeyword.totalStudents(); //calling static method with class name and not with variable name
		obj.studentData();
		obj1.studentData();
	}

}
