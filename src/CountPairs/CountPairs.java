package CountPairs;

import java.util.ArrayList;

import java.util.List;


public class CountPairs {

    /*Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.


Example 1:

Input: nums = [-1,1,2,3,1], target = 2
Output: 3
Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
- (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
- (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target
- (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.*/

    public static void main (String[] args) {

        List <Integer> list = new ArrayList<>();

        list.add(-1);

        list.add(1);

        list.add(2);

        list.add(3);

        list.add(1);

        System.out.println(countPairs(list, 2));

    }

    public static int countPairs(List<Integer> nums, int target) {

        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) sum++;
            }
        }

        return sum;

    }

}
