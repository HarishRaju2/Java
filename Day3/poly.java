public class poly {
 public static void main(String[] args) {
    shapes obj=new shapes(2,2);

 }   
}

class shapes
 {
     shapes()
    {
        System.out.println("This is Square");
    }
    shapes(int x)
    {
        System.out.println("AREA OF SQUARE"+(x*x));
    }
    shapes(int x,int y)
    {
        System.out.println("PERIMETER OF RECTANGLE="+(x*y)*4);
    }

 }