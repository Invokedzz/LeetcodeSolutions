package SumsDifference;

import java.util.ArrayList;
import java.util.List;

public class SumsDifference {

    /*2894. Divisible and Non-divisible Sums Difference

        You are given positive integers n and m.

        Define two integers as follows:

        num1: The sum of all integers in the range [1, n] (both inclusive) that are not divisible by m.
        num2: The sum of all integers in the range [1, n] (both inclusive) that are divisible by m.
        Return the integer num1 - num2*/

    public static void main (String[] args) {

        int n = 10;

        int m = 3;

        System.out.println(differenceOfSums(n, m));

    }

    public static int differenceOfSums(int n, int m) {

        List< Integer > list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            list.add(i);

        }

        int sum = 0;

        int sum2 = 0;

        for (int numbers : list) {

            if (numbers % m != 0) sum += numbers;

            if (numbers % m == 0) sum2 += numbers;

        }

        return sum - sum2;

    }

}
