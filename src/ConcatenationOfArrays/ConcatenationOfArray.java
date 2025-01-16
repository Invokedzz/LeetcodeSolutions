package ConcatenationOfArrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    /*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

      Specifically, ans is the concatenation of two nums arrays.

        Return the array ans.

        Example 1:

        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]*/

    public static void main ( String[] args ) {

        int [] nums = {1, 2, 1};

        int[] result = getConcatenation(nums);

        System.out.println(Arrays.toString(result));

    }

    public static int[] getConcatenation(int[] nums) {

        int [] concatArray = new int[nums.length * 2];

        for ( int index = 0; index < nums.length; index++) {

            concatArray[index] = nums[index];

            concatArray[index + nums.length] = nums[index];

        }

        return concatArray;

    }

}
