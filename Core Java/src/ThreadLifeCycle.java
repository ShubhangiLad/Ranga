public class ThreadLifeCycle
{
    public static void main(String[] args)
    {
        Thread.State[] states = Thread.State.values();
 
        for (Thread.State state : states)
        {
            System.out.println(state);
        }
    }
}
