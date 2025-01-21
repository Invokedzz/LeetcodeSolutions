package ProductOfAnInteger;

import java.lang.reflect.Array;

public class Product {

    public static void main (String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int multi = 1;

        String newN = Integer.toString(n);

        System.out.println(newN);

        for (int i = 0; i < newN.length(); i++) {
            sum += Integer.parseInt(String.valueOf(newN.charAt(i)));
        }

        for (int j = 0; j < newN.length(); j++) {

            int d = Integer.parseInt(String.valueOf(newN.charAt(j)));
            multi *= d;

        }

        return multi - sum;

    }

}
