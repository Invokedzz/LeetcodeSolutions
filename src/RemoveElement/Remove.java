package RemoveElement;

import java.util.ArrayList;

import java.util.List;

public class Remove {

    public static void main (String[] args) {

        int [] nums = {3,2,2,3};

        System.out.println(removeElement(nums, 3));

    }

    public static int removeElement(int[] nums, int val) {

        // nah this problem sucks ass

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;

    }

}
