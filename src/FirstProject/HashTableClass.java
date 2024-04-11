package FirstProject;
/*
 * 1. Synchronization or Thread Safe: This is the most important difference between two. HashMap is non synchronized and not thread safe. On the other hand, HashTable is thread safe and synchronized. When to use HashMap? answer is if your application do not require any multi-threading task, in other words hashmap is better for non-threading applications. HashTable should be used in multithreading applications.
 * 2. Null keys and null values: Hashmap allows one null key and any number of null values, while Hashtable do not allow null keys and null values in the HashTable object.
 * 3. Iterating the values: Hashmap object values are iterated by using iterator. HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object.
 */

import java.util.HashMap;

public class HashTableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> obj = new HashMap <Integer,String>();
		obj.put(0, "hello");
		obj.put(1, "joker");
		obj.put(2, "fruits");
		obj.put(3, "london");
		obj.put(4, "potato");
		System.out.println(obj.get(4));
		

	}

}
