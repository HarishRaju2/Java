import java.util.Scanner;
public class arry
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Array value");
        Scanner obj=new Scanner(System.in);
        int x[]=new int[5];
        for(int i=0;i<x.length;i++)
        {
            System.out.println("Enetr number "+i);
            x[i]=obj.nextInt();
        }
        for(int i=0;i<=x[i];i++)
        {
            if(x[i]%2==0)
            {
                  System.out.println("Even number="+x[i]);
            }
            else{
                System.out.println("Odd number="+x[i]);
            }
        }

    }
}