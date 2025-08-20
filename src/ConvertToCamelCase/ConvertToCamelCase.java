package ConvertToCamelCase;

import java.util.Arrays;

public class ConvertToCamelCase {

    public static void main (String[] args) {

        String word = "Black-Blue-river-Wall-up-side-side";
        String res = toCamelCase(word);

        System.out.println(res);

    }

    private static String toCamelCase (String s) {

        String removeSpecialChars = s.replaceAll("[-_]", " ");
        String [] arrSplit = removeSpecialChars.split(" ");
        String result = "";

        for (int i = 0; i < arrSplit.length; i++) {
            String val = arrSplit[i];
            if (i >= 1) {
                char updatedCh = Character.toUpperCase(val.charAt(0));
                String updatedVal = val.replaceFirst(String.valueOf(val.charAt(0)), String.valueOf(updatedCh));
                result += updatedVal;
            } else {
                result += val;
            }
        }

        return result;


    }

}
