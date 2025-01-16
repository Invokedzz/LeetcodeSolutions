package TwoSum;

import java.util.Arrays;

public class TwoSum {

    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

      You may assume that each input would have exactly one solution, and you may not use the same element twice.

       You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

    public static void main ( String[] args ) {

        int [] elements = { 2, 7, 11, 15 };

        int[] result = twoSum(elements, 9);

        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int index = 0; index < nums.length; index++) {

            for (int j = index + 1; j < nums.length; j++) {

                if (nums[index] + nums[j] == target) return new int[]{index, j};

            }

        }

        return new int[]{0};

    }

}
