package inheritance;

public class OverLoading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        OverLoading overLoading= new OverLoading();
        System.out.println(overLoading.add(3,5));
        System.out.println(overLoading.add(3,5, 8));
        System.out.println(overLoading.add(3.6,5.7));
    }
}
