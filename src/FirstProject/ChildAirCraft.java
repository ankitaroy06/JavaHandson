package FirstProject;

public class ChildAirCraft extends AbstractClass{

	public static void main(String args[]) {
		ChildAirCraft obj1= new ChildAirCraft(); 
		obj1.engine();
		obj1.SafetyGuidelines();
		obj1.color();
		
		/*obj1.license();
		 * This is private method of the abstract class. Hence we can't inherit it 
		 */
		
		/*AbstractClass obj2=new AbstractClass();
		 * we cannot create the object of the abstract class. Abstract Classes cannot be instantiated
		 */
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Body colour is WHITE & RED");
	}

}
