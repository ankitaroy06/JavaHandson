package FirstProject;
/*
 * super keyword will consider the value from the parent class
 * we can inherit the parent class constructor in the child class constructor, only by "super()"   
 */
public class SuperKeyword extends SuperKeywordParentClass{
	String str = "Java Programming";
	
	public SuperKeyword() {
		super();// always should the first line of the child constructor. Inheriting parent class constructor using super keyword
		System.out.println("Child class constructor block");
	}
	
	public void name() {
		super.name(); // inheriting parent class method using "super" keyword
		System.out.println("Shubham");
	}
	public void getStr() {
		System.out.println(str);// local class variable
		System.out.println(super.str); // inheriting variable from parent class using 'super' keyword
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword objKeyword= new SuperKeyword();
		objKeyword.name();
		objKeyword.getStr();
	}

}
