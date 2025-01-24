package Difference;

public class DigitSum {

    /*You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.



Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation:
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.*/

    public static void main (String[] args) {

        int [] nums = {1,15,6,3};

        System.out.println(differenceOfSum(nums));

    }

    public static int differenceOfSum(int[] nums) {

        int sum = 0;

        for (int elements : nums) {
            sum += elements;
        }

        int digitSum = 0;

        for (int elements2 : nums) {
            while (elements2 > 0) {
                digitSum += elements2 % 10;
                elements2 /= 10;
            }
        }

        return Math.abs(sum - digitSum);

    }

}
