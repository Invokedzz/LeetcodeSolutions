package TallestPeople;

import java.util.Arrays;

import java.util.HashMap;

import java.util.Map;

public class TallestPeople {

    /*You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.



Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.*/

    public static void main (String[] args) {

        String [] names = {"Mary","John","Emma"};

        int [] heights = {180,165,170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    public static String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {

            map.put(heights[i], names[i]);

        }

        Arrays.sort(heights);

        String [] ans = new String[names.length];

        int index = 0;

        for (int i = names.length - 1; i >= 0; i--) {
            ans[index] = map.get(heights[i]);
            index++;
        }

        return ans;

    }

}
