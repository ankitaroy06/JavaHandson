package FirstProject;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
*/
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
 * Java Streams, Lambda Expressions for Building Optimized Code
 * What are Streams? Stream API is new feature available from java 8 By using streams, we can perform various aggregate operations on the data returned from collections classes by drastically reduce the complexity of code
 * What is Lambda Expression? Lambda expressions introduce the new arrow operator -> into Java. It divides the lambda expressions in two parts: The left side specifies the parameters required by the expression, which could also be empty if no parameters are required. The right side is the lambda body which specifies the actions of the lambda expression.
 * 
 * The working of stream can be explained in three stages:
 * 1. Create a stream
 * 2. Perform intermediate operations on the initial stream to transform it into another stream and so on on further intermediate operations
 * 3. Perform terminal operation on the final stream to get the result.
 * An important characteristic of intermediate operations is laziness. When executing this code snippet, nothing is printed to the console. That is because intermediate operations will only be executed when a terminal operation is present
 *
 * Note: The aggregate operations that we perform on the collection, array or any other data source do not change the data of the source, they simply return a new stream.
 */
public class StressClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		ArrayList<String> a= new ArrayList<String>();
		a.add("ram");
		a.add("adam");
		a.add("anna");
		a.add("john");
		a.add("sam");
		a.add("dam");
		a.add("aam");
		//method 1- using for loop
		/*for(int i=0;i<a.size();i++) {
			String name= a.get(i);
			if(name.startsWith("a")) //it is case sensitive it can only find names with "a" but not with "A"
				count++;
		}
		System.out.println("Names starts with a: "+count);	*/
		
		//method 2- using stream
		/*
		 * a.stream()= converting into stream
		 * s.startsWith("a") = lambda expression
		 * count()= terminal operation
		 * filter()= intermediate operation
		 * terminal operation will only work with intermediate operation
		 * terminal operation will only work if the intermediate operation is true.
		 * 
		 */
		Long c= a.stream().filter(s->s.startsWith("a")).count();
		System.out.println("Names starts with a: "+c);
		
		/*
		 * we can also create stream without collections. Also need to import Stream class of util pkg
		 * Stream.of("ram", "adam", "anna", "jhon", "sam", "dam","aam").filter(s->s.startsWith(""));
		 */
		
		//printing arraylist values using forEach in stream
		a.stream().filter(s->(s.length()>3)).forEach(s->System.out.print(s+ " ")); //to print all the elements that satisfies the condition
		System.out.println();
		a.stream().filter(s->(s.length()>3)).limit(1).forEach(s->System.out.println(s)); //to limit the output for printing. Here, we are limiting the output till 1 data only using "limit()" as terminal operation
		
		//using map in streams
		Stream.of("ram", "adam", "anna", "jhon", "sam", "dam","aam").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.print(s));
		System.out.println();
		
		//print names which starts with 'a' and in sorted way and in uppercase
		Stream.of("ram", "adam", "anna", "jhon", "sam", "dam","aam").filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));
		System.out.println();
		
		/*
		 * to change array into arrayList and using stream API
		 * List<String>names = Arrays.asList("ram", "adam", "anna", "jhon", "sam", "dam","aam");
		 * names.stream().filter(s->s.startsWith("a")).count();
		 */
		
		/*
		 * how to merge 2 arrayLists
		 * declare the arrays, if need change to arrayList
		 * change to stream and use concat operation to merge
		 */
		List<String>fruits = Arrays.asList("apple", "mango", "orange", "banana", "kiwi", "papaya","cane");
		Stream<String> newList=Stream.concat(a.stream(), fruits.stream());		
		System.out.println("Total merged elements in the new List= "+ newList.count()); // here the stream is getting consumed, as we are using terminal operation on it. We need another copy of the stream to perform any operations further.
		Stream<String> newList1= Stream.concat(a.stream(), fruits.stream()); //created a new stream, by applying same operations
		System.out.print("Merged elements: ");
		newList1.forEach(s->System.out.print(s+ "; "));
		System.out.println();
		
		/*
		 * using anymatch()function in the stream function to check the value is available or not in the list 
		 */
		Stream<String> newList2= Stream.concat(a.stream(), fruits.stream()); //created a new stream, by applying same operations
		boolean val= newList2.anyMatch(s->s.equalsIgnoreCase("grapes"));
		if (val) {
			System.out.println("Search item is available");
		}
		else {
			System.out.println("Search item is not available");
		}
		
		/*
		 * using collect()method to collect the stream elements back to the list
		 */
		Stream<String> newList3= Stream.concat(a.stream(), fruits.stream()); //created a new stream, by applying same operations
		List<String> convertedList= newList3.filter(s->s.startsWith("a")).collect(Collectors.toList());
		System.out.println("Selected iteams in the new list: "+ convertedList);
		
		//printing list values according to the index number
		System.out.println("Selected item from the new list: "+ convertedList.get(2));
		
		//WAP to print the unique numbers from the and also sort the array
		/*
		 * first change the array as list
		 * convert the list as stream
		 * use distinct method to find the unique elements
		 */
		List<Integer> num= Arrays.asList(1,5,7,4,5,7,9,4,6,3,2,5,6,3,8,9,5,6,5);
		System.out.print("List of unique numbers: ");
		num.stream().distinct().forEach(s->System.out.print(s+ "; "));
		System.out.println();
		System.out.print("The sorted list: ");
		num.stream().sorted().forEach(s->System.out.print(s+ "; "));
		System.out.println();
		System.out.print("The unique sorted list: ");
		num.stream().distinct().sorted().forEach(s->System.out.print(s+ "; "));
	}
}
