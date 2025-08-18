package SpinWords;

import java.util.Arrays;

public class SpinWords {

    public static void main (String[] args) {

        String sentence = "Hey fellow warriors";
        String res = spinWords(sentence);
        System.out.println(res);

    }

    public static String spinWords (String sentence) {

        String [] arr = sentence.split(" ");
        String reverse = "";
        int j = 0;

        for (String string : arr) {
            if (string.length() >= 5) {
                char [] toChar = string.toCharArray();
                for (int i = string.length() - 1; i >= 0; i--) {
                    reverse += toChar[i];
                }
            } else {
                reverse += string;
            }

            if (j < arr.length - 1) {
                reverse += " ";
            }

            j++;

        }

        return reverse;

    }

}
