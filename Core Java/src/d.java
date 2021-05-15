public class d
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
 
        int[] b = new int[100];
 
        double[] c = new double[20];
 
        a = b;
        for(int i=0;i<a.length;i++)
        {
        System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(a.length);
      //  b = c;     //Compile Time Error : can not convert from double[] to int[]
    }
}
