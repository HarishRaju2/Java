class stu_1
{
    public void hari()
    {
        System.out.println("He is absent");
    }
}
class stu_2 extends stu_1
{
    public void hari()
    {
        System.out.println("suffering from fever");
    
    }
    public void bala()
    {
        System.out.println("He is present");
    
    }

}
public class upcaste
{
    public static void main(String[] args)
    {
        stu_2 s1=new stu_2();
        stu_1 s2=(stu_1)s1;
        s1.hari();
    }
}