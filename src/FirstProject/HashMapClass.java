package FirstProject;

/*
 * A Map is an object that maps keys to values. A map cannot contain duplicate keys.
 * Below are main implementations of Map interfaces: HashMap, TreeMap, LinkedHashMap
 * In hashmap, we can store items in "key/value" pairs, and can access them by an index of another type
 */

/*
 * HashMap vs HashTable
 * 1. Synchronization or Thread Safe: This is the most important difference between two. HashMap is non synchronized and not thread safe. On the other hand, HashTable is thread safe and synchronized. When to use HashMap? answer is if your application do not require any multi-threading task, in other words hashmap is better for non-threading applications. HashTable should be used in multithreading applications.
 * 2. Null keys and null values: Hashmap allows one null key and any number of null values, while Hashtable do not allow null keys and null values in the HashTable object.
 * 3. Iterating the values: Hashmap object values are iterated by using iterator. HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.*;


public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,String> obj = new HashMap <Integer,String>();
		obj.put(0, "hello");
		obj.put(1, "joker");
		obj.put(2, "fruits");
		obj.put(3, "london");
		obj.put(4, "potato");
		System.out.println(obj.get(4));
		
		/* we can also print each value in below code set
		 * for(int i=0;i<5;i++)
			System.out.println(obj.get(i));
		*/
		
		Set setVar= obj.entrySet(); //converting Map into Set, so that we can use iterator
		Iterator iterator= setVar.iterator(); //applying iterator to Set collection
		
		//to consider each element
		while(iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)iterator.next(); // to extract only values from the "key & value" block 
			System.out.print("Key: "+ mapEntry.getKey());
			System.out.println(" Value: "+ mapEntry.getValue());
		}		
	}
}
