public class demostatic
{
    public static void main(String[] args)
    {
        one obj=new one();
        obj.dis();
        obj.disp_1();

    }
}
class one
{
    int a=10;
    static int b=99;
    public void dis()
    {
        System.out.println(a);
    }
    static public void disp_1()
    {
        one obj=new one();
        System.out.println(obj.a);
    }

} 