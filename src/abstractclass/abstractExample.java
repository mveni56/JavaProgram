package abstractclass;

public class abstractExample  implements interface1,interface2{


    @Override
    public void display() {
        interface1.super.display();
        interface2.super.display();
    }

    public static void main(String[] args)
    {
        abstractExample absexp=new abstractExample();
        absexp.display();
    }

    }

