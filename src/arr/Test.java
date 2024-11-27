package arr;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args)
    {
        LocalDate currentDate= LocalDate.now();

        System.out.println( currentDate.plusDays(2));
    }
}
