package ConsistentStrings;

import java.util.HashSet;
import java.util.Set;

public class ConsistentStrings {

    /*You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.



Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.*/

    public static void main (String[] args) {

        String allowed = "ab";

        String[] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed, words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {

        Set<Character> allowedSet = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            allowedSet.add(allowed.charAt(i));
        }

        int sum = 0;

        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!allowedSet.contains(word.charAt(i))) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) sum++;

        }

        return sum;

    }

}
