package SumMixed;

import java.util.Arrays;
import java.util.List;

public class Mixed {

    public static void main (String[] args) {

        List <?> mixed = Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7);
        int res = sum(mixed);

        System.out.println(res);

    }

    private static int sum (List<?> mixed) {

        int total = 0;

        for (Object o : mixed) {

            total += Integer.parseInt(o.toString());

        }

        return total;
    }

}
