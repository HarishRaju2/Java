

import java.util.Iterator;
import java.util.LinkedList;

public class linked_list 
{
    public static void main(String[] args) 
    {
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("Tiruppur");
        l1.add("Coimbatore");
        l1.add("Trichy");
        l1.add("Salem");

        l1.add(2,"Erode");
        l1.add(3,"Dharmapuri");

         boolean remove=l1.removeFirstOccurrence("Erode");
         boolean remove1=l1.removeLastOccurrence("Dharmapuri");

        Iterator ti=l1.iterator();
        while (ti.hasNext()) {
            System.out.println(ti.next()+"\n"); 
            System.err.println("**********************************************"); 
        }

        System.out.println(l1.getFirst()+"\n");
        System.out.println(l1.getLast()+"\n");
        System.err.println("**********************************************");

        System.out.println(l1.poll());
        System.out.println(l1.set(2,"Chennai")+"\n");
        System.err.println("**********************************************");

        System.out.println(l1.clone()+"\n");
        System.out.println(l1.peek()+"\n"); 
        System.err.println("**********************************************");
        
        System.out.println(l1.peekLast()+"\n"); 
        System.out.println(l1.peekFirst()+"\n");

    


    }
}
