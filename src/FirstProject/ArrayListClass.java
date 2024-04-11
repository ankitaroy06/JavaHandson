package FirstProject;

import java.util.ArrayList;
/*
 * all the collection framework comes under 'util' pkg.
 * ArrayList is having having dynamic size where we can add or delete data however we want
 * List of arrayList methods: https://www.programiz.com/java-programming/library/arraylist
 */
public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("heelo");
		a.add("omni");
		a.add("night");
		a.add(1, "tablet");
		System.out.println("Element in the list:" +a);
		a.remove(0);
		a.remove("omni");
		System.out.println("Element in the list:" +a);
	}

}
