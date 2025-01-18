package WordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {

    /*You are given a 0-indexed array of strings words and a character x.

     Return an array of indices representing the words that contain the character x.

    Note that the returned array may be in any order.

    Example 1:

    Input: words = ["leet","code"], x = "e"
    Output: [0,1]
    Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.*/

    public static void main (String[] args) {

        String[] words = {"leet","code"};

        char x = 'e';

        System.out.println(findWordsContaining(words, x));

    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List <Integer> list = new ArrayList<>();

        int n = words.length;

        for (int index = 0; index < n; index++) {

            if (words[index].indexOf(x) != -1) list.add(index);

        }

        return list;

    }

}
