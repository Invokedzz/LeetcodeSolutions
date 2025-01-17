package ArrayShuffle;

import java.util.Arrays;

public class Shuffle {

    public static void main ( String[] args ) {

        int[] nums = {2,5,1,3,4,7};

        int[] result = shuffle(nums, 3);

        // output needs to be: [2,3,5,4,1,7]

        System.out.println(Arrays.toString(result));

    }

    public static int[] shuffle(int[] nums, int n) {

        int[] newArray = new int[n * 2];

        for (int index = 0; index < n   ; index++) {

            newArray[index * 2] = nums[index];
            newArray[index * 2 + 1] = nums[index + n];

        }

        return newArray;

    }

}
