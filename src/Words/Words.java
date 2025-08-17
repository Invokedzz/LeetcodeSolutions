package Words;

import java.util.Arrays;

public class Words {

    public static void main (String[] args) {

        int result = findShort("woods I will come and meet you at the");

        System.out.println(result);

    }

    public static int findShort (String s) {

        String [] str = s.split(" ");
        String temp;
        boolean swapped = true;
        int j = 0;

        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < str.length - 1; i++) {
                if (str[i].length() > str[i + 1].length()) {
                    temp = str[i+1];
                    str[i + 1] = str[i];
                    str[i] = temp;
                    swapped = true;
                }
            }
        }

        return str[0].length();

    }

}
