package FirstProject;
import java.util.*;
/*import java.util.HashSet;
* import java.util.Iterator;
* hashset, treeset, linkedhashset implements set interface
* set interface does not allow duplicate element entries
* set doesn't add elements in order. Randomly elements are added in random positions.
* also set return value in random order.
*/
public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj= new HashSet<String>();
		obj.add("Hello");
		obj.add("hi");
		obj.add("how");
		obj.add("are");
		obj.add("you");
		System.out.println(obj); // elements will be printed randomly
		obj.add("Hello"); //duplicates are not allowed
		System.out.println(obj); //duplicates are not allowed
		obj.remove("Hello"); // removing element from the list
		System.out.println(obj);
		
		/*
		 * Iterator in Java is an object used to cycle through arguments or elements present in a collection.
		 * Generally, an iterator in Java is used to loop through any collection of objects.
		 * The Iterator interface allows us to modify a collection while traversing it, which is more difficult with a simple for/while statement.
		 * more details on iterators: https://www.w3schools.com/java/java_iterator.asp
		 */
		Iterator<String> i= obj.iterator();
		System.out.println(i.next()); 
	}

}
