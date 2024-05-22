public class str_vowels
{
    public static void main(String ads[])
    {
        str_samp obj=new str_samp();

    }
}
class str_samp
{
    str_samp()
    {
        String name ="harish";
        int vo=0;
        int con=0;
        for(int i=0;i<name.length();i++)
        {
            if((name.charAt(i)=='a')||(name.charAt(i)=='e')||(name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u'))
            {
                vo++;
            }
            else
            {
                con++;
            }
        }
        System.out.println("Number of vowels in name Harish is ="+vo);
        System.out.println("Number of Non-vowels in name Harish is ="+con);
    }
}