
import java.util.ArrayList;

import java.util.Iterator;

class sample
{
    ArrayList<String> a=new ArrayList<>();
    sample()
    {
        a.add("Kec");
        a.add("Nandha");
        a.add("Psg");
        a.add("sastra");

        

        Iterator ti=a.iterator();
        while (ti.hasNext()) {
            System.out.println(ti.next());
            
        }
    }
}

public class arrlist_char 
{
    public static void main(String[] args) {
        sample obj=new sample();
        
    }
    
    
}
