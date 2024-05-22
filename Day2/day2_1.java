class song
{
    String s1=" life of Ram";
    public void s1_rec()
    {
        System.out.println(s1);
    }
}
class song_1 extends song
{
    String s2=" chikini chamelo";
    song sr;
    public void s2_rec()
    {
        super.s1_rec();
        System.out.println(s2,song sr);
    }
}


public class day2_1
{
    public static void main(String ads[])
    {
        song_1 obj=new song_1();
        obj.s2_rec();

    }
}