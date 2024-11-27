package setExample;

import java.util.HashSet;
import java.util.Iterator;

public class SetExp {
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<String>();
        hs.add("ford");
        hs.add("honda");
        hs.add("toyota");
        hs.add("audi");
        hs.add("null");

        for(String str:hs)
        {
            System.out.println("Printing the hashset : "+ str);
        }
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.println("The each item in the set will be : "+itr.next());
        }
    }

}
