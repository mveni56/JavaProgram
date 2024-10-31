package inheritance;

class Vehicle
{
    void name()
    {
        System.out.println("This is the main class");
    }
}

class Car extends  Vehicle{
    void type()
    {
        System.out.println("This is the car class");
    }


}

public class SingleInheritance {
    public static void main(String[] args)
    {
        Car car = new Car();
        car.type();
        car.name();
    }
}
