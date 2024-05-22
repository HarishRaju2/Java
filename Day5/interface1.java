interface details
{
    int age=32;
    String name="harish";
    void get_details();
}
class sample implements details
{
    public void get_details()
    {
        System.out.println(age);
    }
}
public class interface1
{
    public static void main(String args[])
    {
        sample obj=new sample();
        obj.get_details();


    }
}