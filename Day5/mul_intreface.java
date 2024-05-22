interface features
{
    void seat();
    default void colors()
    {
        System.out.println("red,blue,black");

    }
}
interface safety extends features
{
    void rating();
}
class sample implements safety
{
    sample( ){}
    public void seat()
    {
        System.out.println("7 Seater");
    }
    public void rating()
    {
        System.out.println("5-Star Rating");
    }
 }

public class mul_intreface
{
    public static void main(String args[])
    {
        sample obj=new sample();
        obj.colors();
        obj.seat();
        obj.rating();
    }
}