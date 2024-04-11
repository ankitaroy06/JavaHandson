package FirstProject;
import java.util.*;
/*
 * Amazon Interview question:
 * print the frequency of appearance of each digit using collections
 * Given array is : [4,5,5,5,6,4,4,9,4]
 * Output: 4: 4; 5: 3; 6: 1; 9: 1
 */
public class CollectionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {4,5,5,5,6,4,4,9,4,8};
		int count=0,i,j;
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(i=0;i<ar.length;i++) {
			count=0;
			if(!al.contains(ar[i])) {
				al.add(ar[i]);
				count++;
				for(j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j])
					count++;
				}
				System.out.println("No of frequency of: "+ ar[i]+" is "+ count);
			}				
		}
	}
}
