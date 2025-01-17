package MinimumOperation;

public class MinimumOp {

    /*You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

      Return the minimum number of operations to make all elements of nums divisible by 3.

    Example 1:

    Input: nums = [1,2,3,4]

    Output: 3

    Explanation:

    All array elements can be made divisible by 3 using 3 operations:

    Subtract 1 from 1.
    Add 1 to 2.
    Subtract 1 from 4.*/

    public static void main (String[] args) {

        int [] nums = {1,2,3,4};

        System.out.println(minimumOperations(nums));

    }

    public static int minimumOperations(int[] nums) {

        int counter = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 3 != 0) {
                nums[index] += 1;
                counter += 1;
            }
        }

        return counter;

    }

}
