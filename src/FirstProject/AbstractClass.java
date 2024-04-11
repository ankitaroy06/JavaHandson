package FirstProject;

/*What is Abstraction?
 *abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. In other words, the user will have the information on what the object does instead of how it does it.
 *
 * Abstract Classes & Methods:
 * Class which is declared with the abstract keyword is known as an abstract class in Java
 * It can have abstract (method with out the body).and non-abstract methods (method with the body).
 * Abstraction Classes achieves Partial Abstraction. Interfaces on the other hand are used for 100% abstraction.
 * 
 * Real Life Example
 * There is a parent class which defines Aircraft Body Construction rules
 * All Child classes (Different Aircraft companies) have to inherit parent class and use those methods to build their own Aircraft
 * But there is a method called Aircraft color which can be unique to every child class depending on their company logo
 * So, color method in parent class is not implemented with anybody. Instead only method is defined with out any body which we call as Abstract method.
 * If there is any method in class which is Abstract, then the class will be treated as Abstract class
 * Unlike Interfaces, this Abstract Class can have methods (Concrete) which have implementation as well. So, with Abstract class only partial Abstraction is achieved.
 * We cannot instantiate object for Abstract class. Child classes are forced to implement Abstract methods of Parent class.
 * 
 * Differences between Abstract Classes & Interfaces
 * Interface:
 * 1) Interface contains only abstract methods
 * 2) Access Specifiers for methods in interface must be public
 * 3) Variables defined must be public, static, final
 * 4) To implement an interface we use implements keyword
 * Abstract Class:
 * 1) Abstract class can contain abstract methods,concrete methods or both
 * 2) Except private we can have any access specifier for methods in abstract class.
 * 3) Except private variables can have any access specifiers
 * 5) To implement an abstract we use extends keyword
 * 
 * 
 */

//this class will show the manufacturing model of the aircrafts
public abstract class AbstractClass {
	
		public void SafetyGuidelines() {
			System.out.println("Safety Guidelines");
		}
		
		public void engine() {
			System.out.println("Engine Guidelines");
		}
		
		private void license() {
			System.out.println("License should be Private");
		} //if any method is private, even though we inherit the class, the private method cannot be inherited.
		
		public abstract void color();
}
