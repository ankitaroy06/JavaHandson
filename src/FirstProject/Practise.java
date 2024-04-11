package FirstProject;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Swapping values with temporary variable
		System.out.println("Swapping with temp variable");
		int a=1, b=10, temp;
		System.out.println("Before swapping: "+"a = "+a+", b = "+ b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: "+"a = "+a+", b = "+ b);
		System.out.println();
		
		//Swapping values without temporary variable
		System.out.println("Swapping without temp variable");
		a=1; b=10;
		System.out.println("Before swapping: "+"a = "+a+", b = "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: "+"a = "+a+", b = "+ b);
		System.out.println();
		
		//swapping array values to sort them
		int arr[]= {5,3,4,1,2};
		System.out.print("Before sorting: ");
		for(int i = 0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		
		for(int i=0;i<arr.length-1;i++) {
			temp=arr[i];
			for(int j=i+1;j<arr.length;j++)
			if(temp>arr[j]) {
				arr[i] = arr[j];
				arr[j] = temp;
				temp= arr[i];
			}
		}
		System.out.println();
		System.out.print("After sorting: ");
		for(int i = 0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

}
