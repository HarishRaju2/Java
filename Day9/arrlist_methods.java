

import java.io.*;
import java.util.ArrayList;
import java.util.Spliterator;
 
public class arrlist_methods{
 
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
 
        names.add("Bala");
        names.add("anand");
        names.add("Raja");
        names.add("praveen");
        names.add("Easwaren");
 
        Spliterator<String> spliterator
            = names.spliterator();
 
        spliterator.forEachRemaining(System.out::println);
    }
}