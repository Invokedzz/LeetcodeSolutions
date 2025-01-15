package GoodPairs;

public class GoodPairs {

    public static void main ( String[] args ) {

        int [] values = {1,2,3,1,1,3};

        int value = numIdenticalPairs( values );

        System.out.println( value );

    }

    private static int numIdenticalPairs(int[] nums) {

        /*Given an array of integers nums, return the number of good pairs.

        A pair (i, j) is called good if nums[i] == nums[j] and i < j.

        Example 1:

        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
        Example 2:

        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.
        Example 3:

        Input: nums = [1,2,3]
        Output: 0*/

        int sum = 0;

        for ( int index = 0; index < nums.length; index++ ) {

            for ( int j = index + 1; j < nums.length; j++ ) {

                if ( nums[index] == nums[j] && index < j ) sum += 1;

            }

        }

        return sum;

    }

}
