public class static_block
{
    public static void main(String[] args)
    {
        System.out.println(var.a);

    }
}
class var
{
    static int a=10;
    static
    {
    
        System.out.println("hello");
    }
}