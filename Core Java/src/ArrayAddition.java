
public class ArrayAddition {
	public static void main(String[] args) { 
		int a1[] = {1,2,5,2,4,0,6};
		int sum = 4;
		int s = 0;
		for(int i=0;i<a1.length;i++) { 
			for(int j=i+1;j<a1.length;j++) { 
				s= a1[i]+a1[j];
				if(s==sum) { 
					System.out.println("["+a1[i]+","+a1[j]+"]");
				}
			}
		}
	}

}
