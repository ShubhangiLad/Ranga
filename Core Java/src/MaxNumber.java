import java.util.ArrayList;
import java.util.Scanner;

public class MaxNumber {
	
	public static void main(String[] args) {  
		
		/*Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(n1>n2)
			System.out.println(n1 +" is greater than "+n2);
		else if(n1<n2)
			System.out.println(n1 + " is less than "+n2);
		else
			System.out.println(n1 + " and " + n2+" are equal");
	}*/
		
		int [] arr = {6,8,2,9,3};
		int max=0;
		
		
		for(int i=0;i<arr.length-1;i++) { 
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}		

}
