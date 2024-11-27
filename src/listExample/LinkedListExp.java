package listExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args){

        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("hampster");
        System.out.println("LinkedList: " + animals);

        String str=animals.get(1);
        System.out.println("First element is "+ str);

        animals.set(3,"butterfly");
        System.out.println("the updated list : "+animals);

        for(String str3:animals)
        {
            System.out.println("The list iteration : "+str3);
        }

        Iterator<String> itr=animals.iterator();
        while(itr.hasNext())
        {
            String str4= itr.next();
            System.out.println("The iterator element will be : "+str4);
        }
    }


}
