package inheritance;


class Parent
{
    public void show(){
        System.out.println("Parent class show method");
    }
}

class Child extends Parent{
    public void show(){
        System.out.println("Child class show method");
    }
}



public class OverRidding {
    public static void main(String[] args)
    {
        Parent parent=new Parent();
        parent.show();
        Child child = new Child();
        child.show(); //compiletime polymorphism
        Parent parent1=new Child();
        parent1.show(); //runtime polymorphism
    }
}
