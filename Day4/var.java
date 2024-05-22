public class var
{
    public static void main(String[] args)
    {
        variable obj=new variable(12,"Hari");
        
    }
}
class variable
{ 
    int a;
    String name;
    variable(int a,String name)
    {
        this.a=a;
        this.name=name;
        System.out.println(a+name);
    }
}
