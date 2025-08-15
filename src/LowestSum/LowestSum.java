package LowestSum;

import java.util.Arrays;

public class LowestSum {

    public static void main (String[] args) {

        long [] numbers = {19, 5, 42, 2, 77};

        System.out.println(sumTwoSmallestNumbers(numbers));

    }

    public static long sumTwoSmallestNumbers (long[] numbers) {

        boolean swapped = true;
        int j = 0;
        long tmp;

        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < numbers.length - j; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

        return numbers[0] + numbers[1];

    }

}
