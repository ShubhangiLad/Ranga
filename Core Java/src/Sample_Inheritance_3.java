class A4
{
    int[] a = new int[5];
 
    {
        a[0] = 10;
        System.out.println(a[0]);
    }
}
 
public class Sample_Inheritance_3 extends A4
{
    {
        a = new int[5];
    }
 
    {
        System.out.println(a[0]);
    }
 
    public static void main(String[] args)
    {
        Sample_Inheritance_3 main = new Sample_Inheritance_3();
    }
}