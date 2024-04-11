package FirstProject;

public class TrafficInheritanceClass implements InterfaceClass, InterfaceClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj1= new TrafficInheritanceClass();
		obj1.green();
		obj1.yellow();
		obj1.red();
		
		TrafficInheritanceClass obj2= new TrafficInheritanceClass();
		obj2.walk();
		
		InterfaceClass2 obj3= new TrafficInheritanceClass();
		obj3.trainSymbol();
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("Green: GO");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow: READY");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Red: STOP");
	}
	
	public void walk() {
		System.out.println("Walk on Red");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("If seeing Train symbol, show RED light.");
	}

}
