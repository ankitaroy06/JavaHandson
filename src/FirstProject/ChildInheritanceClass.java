package FirstProject;
/*
 * Does Java supports multiple inheritance?
 * Eg: public class childClass extends ParentClass1, ParentClass2
 * Multiple inheritance is not supported in Java
 * But this concept is allowed in "Interface"
 */
public class ChildInheritanceClass extends InheritanceMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInheritanceClass obj= new ChildInheritanceClass();
		obj.Cat();
		obj.Cow();
		obj.Dog();
		obj.Elephant();
	}

}
