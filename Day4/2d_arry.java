import java.io.*;
public class 2d_arry  
{
    public static void main(String atgs[])
    {
        int a[][]=new int[5][5];
        DemoInputStream ni=new DemoInputStream(System.in);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;i<5;j++)
            {
                try
                {
                    a[i][j]=Integer.parseInt(ni.readline());
                }catch(Exception s){}
            
            }

        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(a[i][j]);
            }
        }
        System.out.println("");
    }
}