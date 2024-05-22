class sample
{
    private String name;
    sample()
    {
    name="Harish";
    char [] c= name.toCharArray();
    for(int i=0;i<c.length;i++)
    System.out.println(c[i]);
    }

}


class privat_access
{
    public static void main(String[] args)
    {
        sample obj=new sample();

    }
}