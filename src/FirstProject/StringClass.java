package FirstProject;

public class StringClass {

	public static void main(String[] args) {
		/*String : it is one of the prebuilt class in java. 2 ways of defining String Objects: 
		*1.String literal
		*2.by creating object of string*/
		
		String a= "javaPractical"; //String literal
		String b= new String("helloWorld"); //by creating object of string

		/* if we declare 2 string String literals of same value, java will not create memory for that object.
		 * But we define same String values by creating Objects, then 2 memory spaces will be created for both the objects.
		 */
		System.out.println(a.length()); //gives the length of the string
		System.out.println(a.charAt(2)); //tells the character in 2nd position
		System.out.println(a.indexOf("P")); //tells the position of the character
		System.out.println(a.substring(3, 6)); //gives the string between given position
		System.out.println(a.substring(5)); //gives the string between given position
		System.out.println(a.concat(b)); //connects 2 strings
		
		System.out.println(a.trim());
		//converts the case of the string
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace("a", "s")); //replace the string with the given character
		String arr[]=a.split("P"); // splits the string from the given character
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		//reverse the string: check for Palindrome String
		String str="madam", str1="";
		for(int i=0;i<str.length();i++) {
			str1= str.charAt(i)+ str1;
		}
		System.out.println(str1+ " str1");
		System.out.println(str+ " str");
		if (str.equals(str1))
			System.out.println("Given string is Palindrome");
		else
			System.out.println("Given string is not Palindrome");
		
		System.out.println();
		/*String is immutable: we can't make any changes to the String variable
		 * StringBuffer & StringBuilder is mutable: the string variable can be changed
		 * StringBuilder is not thread safe, its is non Synchronized. It is faster.
		 */
		
		String s="hello", s1="world";//using String
		s.concat(s1);
		String news=s.concat(s1); //we can't make any changes to already declared variables but we can create a new variable with changes  
		System.out.println("s: " +s+ "; s1: " +s1+ "; news: " +news);
		
		StringBuffer sb=new StringBuffer("hi");
		sb.append("iieeee");
		System.out.println("sb: "+sb);
		
		//"==" vs ".equals()"
		String a1="java", b1="java";
		String c1= new String("java");
		System.out.println("a1 & b1= "+ (a1==b1));// "==" compares the reference value
		System.out.println("a1 & c1= "+ (a1==c1));
		
		// ".equals()" compares the content of the variable
		System.out.println("a1 & b1= "+ (a1.equals(b1)));
		System.out.println("a1 & c1= "+ (a1.equals(c1)));
	}

}
