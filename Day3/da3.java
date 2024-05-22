class A
{
    String name="Hari";
    int age=21;

    public void A_rec()
    {
        System.out.println(name);
    }
}
class B extends A
{
    String branch="CSD";

    public void B_rec()
    {
        super.A_rec();
        System.out.println(branch);
    }
}
class C extends B
{
    int age=21;

    public void C_rec()
    {
        super.B_rec(); 
        System.out.println(age);
    }
}




public class day2
{
    public static void main(String[] args)
    {
        C obj=new C();
        obj.C_rec();

    }
}
