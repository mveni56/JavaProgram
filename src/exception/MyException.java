package exception;

public class MyException {


    public static void main(String[] args)
    {
        try
        {
            int c=10/0;
        }catch(ArithmeticException e)
        {
            System.out.println("Number cannot be divide by zero");
        }finally
        {
            System.out.println("This is the finally block. Always execute");
        }
    }
}
