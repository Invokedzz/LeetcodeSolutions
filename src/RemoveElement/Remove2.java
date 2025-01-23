package RemoveElement;

import java.util.ArrayList;

import java.util.List;

public class Remove2 {

    /*Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

    public static void main (String[] args) {

        int [] nums = {3, 2, 2, 3};

        int val = 3;

        System.out.println(removeElement(nums, val));

    }

    public static int removeElement(int[] nums, int val) {

        List <Integer> list = new ArrayList<>();

        for (int elements : nums) {
            list.add(elements);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) list.remove(i);
        }

        List<Integer> newList = new ArrayList<>(list);

        for (int j = 0; j < newList.size(); j++) {
            if (newList.get(j) == val) newList.remove(j);
        }

        System.out.println(newList);

        return newList.size();

    }

}
