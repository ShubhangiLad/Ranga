public class StringExamples
{
    public static void main(String[] args)
    {
        //Creating string objects using literals
 
        String s1 = "abc";
 
        String s2 = "abc";
 
        System.out.println(s1 == s2);        //Output : true
        System.out.println("Using equals method : "+s1.equals(s2));
        //Creating string objects using new operator
 
        String s3 = new String("abc");
 
        String s4 = new String("abc");
 
        System.out.println(s3 == s4);        //Output : false
        System.out.println("Using equals method : "+s3.equals(s4));
        
        String s5 = "JAVA";
        
        String s6 = "JAVA";
 
        System.out.println(s5 == s6);         //Output : true
 
        s5 = s5 + "J2EE";
 
        System.out.println(s5 == s6);   
        
        String s7 = new String("JAVA");
        String s8 = new String("JAVA");
        
        System.out.println("Comparing "+s7 == s8);   
        System.out.println(s7);         //Output : JAVA
        
        
        s7=s7.concat("J2EE");
 
        System.out.println(s7); 
    }
}