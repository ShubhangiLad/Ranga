
public class StringReverse {

	public static void main(String[] args) {
	String s = "MyJava";
	System.out.println(s);
	StringBuffer sb = new StringBuffer(s);
	System.out.println("Reverse String using String Buffer : "+sb.reverse());
	
	char[] ch = s.toCharArray();
	System.out.println(s.length());
	
	  for(int i=s.length()-1;i>=0;i--) 
	  { 
		  System.out.print(ch[i]);
	  }
	 
	  System.out.println();
	  
	  System.out.println(recursiveMethod(s));
	}
	
	static String recursiveMethod(String s)
	{
		if((null==s || s.length()<=1))
		{
			//System.out.println(s.length());
			//System.out.println("Value of String is : "+s);
			return(s);
			
		}
		return recursiveMethod(s.substring(1))+s.charAt(0);
		
	}

}
