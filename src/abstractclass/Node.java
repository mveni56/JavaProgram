package abstractclass;

import javax.crypto.spec.PSource;

import static java.util.Collections.reverse;

public class Node {
    int value;
    Node left;
    Node right;
    public void node1(int value)
    {
        this.value=value;
        right=null;
        left=null;
    }

    public static void main(String[] args)
    {
        Node node=new Node();
        int temp=0;
        int a=1;
        int b=2;
        b=temp;
        temp=a;
        System.out.println("The reversing element is:"+ a+ "" +b);

    }
}
