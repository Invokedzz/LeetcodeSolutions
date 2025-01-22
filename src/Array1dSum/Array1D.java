package Array1dSum;

import java.util.Arrays;

public class Array1D {

    public static void main (String[] args) {

        int [] nums = {1,2,3,4};

        System.out.println(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {

        int [] runningSum = new int[nums.length];

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }


        return runningSum;

    }

}
