package encapsulation;

class Person
{
    private String firstName;
    private String lastName;

    private int age;
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(int age)
    {
        this.age=age;
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Person person=new Person();
        person.setFirstName("Veni");
        person.setLastName("Muthu");
        person.setName(30);
        System.out.println("name : "+ person.getFirstName()+ " "+ person.getLastName());
        System.out.println("age : "+person.getAge());
    }
}
