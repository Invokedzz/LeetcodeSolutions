package SimpleLetterRemoval;

import java.util.*;

public class SimpleLetterRemoval {

    public static void main (String[] args) {

        String word = "abracadabra";

        System.out.println(solve(word, 7));

    }

    public static String solve(String s, int k) {

        Set <Character> setChar = new TreeSet<>();
        StringBuilder strBuilder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            setChar.add(s.charAt(i));
        }

        int removed = 0;

        for (char ch: setChar) {
            for (int i = 0; i < k; i++) {
                if (strBuilder.charAt(i) == ch) {
                    strBuilder.deleteCharAt(i);
                    removed++;
                    if (removed == k) {
                        return strBuilder.toString();
                    }
                }
            }
        }

        return strBuilder.toString();

    }

}
