public class SIBTest
{
    {
        System.out.println(1);
    }
 
    static
    {
        System.out.println(2);
    }
 
    public SIBTest()
    {
        System.out.println(3);
    }
 
    public static void main(String[] args)
    {
        System.out.println(4);
 
        SIBTest a = new SIBTest();
    }
}