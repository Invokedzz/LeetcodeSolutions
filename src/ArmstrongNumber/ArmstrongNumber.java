package ArmstrongNumber;

public class ArmstrongNumber {

    public static void main (String[] args) {

        int num = 1652;
        System.out.println(isNarcissistic(num));

    }

    public static boolean isNarcissistic (int number) {

        String num = String.valueOf(number);
        int total = 0;
        char [] nums = num.toCharArray();

        for (char c : nums) {
            total += (int) Math.pow(c - '0', nums.length);
        }

        return total == number;

    }

}
