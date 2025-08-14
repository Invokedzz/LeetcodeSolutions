package CommonElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElement {

    public static void main (String[] args) {

        int [] nums1 = {2, 3, 2};
        int [] nums2 = {1, 2};

        System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));

    }

    private static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int answer1 = 0, answer2 = 0;
        Set <Integer> count1 = new HashSet<>(), count2 = new HashSet<>();

        for (int j : nums1) {
            count1.add(j);
        }

        for (int j : nums2) {
            count2.add(j);
        }

        for (int j : nums2) {
            if (count1.contains(j)) {
                answer1++;
            }
        }

        for (int j : nums1) {
            if (count2.contains(j)) {
                answer2++;
            }
        }

        return new int[]{answer2, answer1};

    }

}
