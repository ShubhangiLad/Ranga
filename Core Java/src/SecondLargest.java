
public class SecondLargest {

	public static void main(String[] args) {
		
		System.out.println(secondLargest(new int[] {4,9,3,11,10}));
		System.out.println(secondLargest(new int[] {4,7,12,9,15}));
	}

	 static int secondLargest(int[] a) {
		// TODO Auto-generated method stub
		 int firstLargest,secondLargest;
		 if(a[0]>a[1]) { 
			 firstLargest = a[0];
			 secondLargest = a[1];
		 }
		 else
			 firstLargest = a[1];
		 	 secondLargest = a[0];	
		 	 
		 	 for(int i=2;i<a.length;i++) { 
		 		  if(a[i]>firstLargest) { 
		 			 secondLargest = firstLargest;
		 			   firstLargest = a[i];
		 			   
		 		  }
		 		  else if(a[i]<firstLargest && a[i]>secondLargest) { 
		 			  secondLargest = a[i];
		 		  }
		 	 }
		 
		return secondLargest;
	}

}
