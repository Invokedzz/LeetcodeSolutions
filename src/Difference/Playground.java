package Difference;

public class Playground {

    public static void main (String[] args) {

        int [] nums = {123, 321, 444, 555};

        System.out.println(difference(nums));

    }

    private static int difference (int [] nums) {

        int digits = 0;

        for (int numbers : nums) {

            while (numbers > 0) {

                digits +=  numbers % 10;

                numbers /= 10;

            }

        }

        return digits;

    }

}
