package inheritance;

class Vehicle
{
    public Vehicle()
    {
        System.out.println("Called form constructor");
    }
    void name()
    {
        System.out.println("This is the main class");
    }
}

class Car extends  Vehicle{
    public Car()
    {

        super();
    }
    public Car(String name)
    {

        System.out.println(name);


    }
    void name()
    {

        System.out.println("This is the car class");
    }


}

public class SingleInheritance {
    public static void main(String[] args)
    {
        Car car = new Car();

       // car.type();
        car.name();
        Car car1=new Car("Swift"); //method overlaoding
        Vehicle vehicle= new Vehicle();
        vehicle.name();
        Vehicle vehicle1 = new Car(); // method overridding
        vehicle1.name();
    }
}
