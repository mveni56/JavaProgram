package arr;

import java.util.ArrayList;

public class ArrayListExp {
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("AAAA");
        fruits.add("BBBB");
        fruits.add("CCCC");
        fruits.add("DDDD");
        fruits.add("EEEE");

        System.out.println("ArrayList : "+fruits);

        System.out.println("The first element : "+ fruits.get(0));
        System.out.println("The Third element : "+ fruits.get(3));

        System.out.println("The changed element "+fruits.set(2,"1111"));
        System.out.println("After the arraylist "+fruits);

        ArrayList<Integer> number=new ArrayList<>();
        number.add(45);
        number.add(12);
        for (int i=0;i<12;i++)
        {

            number.add(i);
        }
        System.out.println("Final ArrayList "+ number);
    }
}
