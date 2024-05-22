public class sleep_thread
{
    public static void main(String[] args)
    {
        sample obj=new sample();
        sample1 obj1=new sample1();
        obj.start();
        
        obj1.start();
    }
}
class sample extends Thread
{
    public void run()
    {
          Thread.yield();
        for(int i=0;i<10;i++)
        {
            try
            {
            System.out.println(i);
            Thread.sleep(500);
            }
            catch(InterruptedException s){}
        }
    }
}
class sample1 extends Thread
{
    public void run()
    {
        char c[]={'A','B','C','D','E','F','G','H','I','J'};
        for(int i=0;i<c.length;i++)
        {
            try
            {
            System.out.println(c[i]);
            Thread.sleep(500);
            }
            catch(InterruptedException s){}
          
        }
    }
}