package LargestElements;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LargestElements {

    public static void main (String[] args) {

        int [] nums = {7,8,3,4,15,13,4,1};

        System.out.println(minimumAverage(nums));

    }

    public static double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        int s = 0;

        int e = nums.length - 1;

        double ans = (nums[s] + nums[e]) / 2.0;

        while (s <= e) {

            ans = Math.min(ans, (double) (nums[s] + nums[e]) / 2);

            s++;

            e--;

        }

        return ans;

    }

}
