package Constructors;

public class Person {
    private String name="veni";
    private int age;
    public Person()
    {
        this.name="veni";
        this.age=5;

    }
    public void display()
    {
        System.out.println(name+age);
    }
    public Person(String FirstName,String LastName)
    {
        System.out.println("You first name is "+FirstName);
        System.out.println("yuor last anme is "+LastName);
    }

}



