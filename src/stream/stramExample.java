package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stramExample {

    public static void main(String args[])
    {

        List<String> list = Arrays.asList("apple", "mango","orange");
        final List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("MAP OUTPUT: "+upperCaseList);

    }
}
