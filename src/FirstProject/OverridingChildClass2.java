package FirstProject;

public class OverridingChildClass2 extends  OverridingClass{

	//cat method is overridden here.both the methods will have same name and same arguments
	public void cat() {
		System.out.println("Cat is hungry");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingChildClass2 obj= new OverridingChildClass2();
		obj.cat();
	}

}
