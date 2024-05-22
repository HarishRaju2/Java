public class threadd
{
    public static void main(String[] ads)
    {
        cpu obj=new cpu();
        Thread t1=new Thread(obj);
        t1.start();

    }
}
class cpu extends threadd
{
    public void run()
    {
        System.out.println("child threg");
    }
}
