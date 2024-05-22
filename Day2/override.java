class ride
{
    public void rid(int x)
    {
        System.out.println(x);

    }
    public void rid(String a)
    {
        System.out.println(a);

    }
    public void rid(int x,int y)
    {
        System.out.println(x-y);

    }
}


public class override
{
    public static void main(String[] dsa)
    {
        ride obj=new ride();
        obj.rid(10,12);

    }
}
