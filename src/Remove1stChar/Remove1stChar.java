package Remove1stChar;

import java.util.regex.Pattern;

public class Remove1stChar {

    public static void main (String[] args) {

       String res = remove("eloquent");

       System.out.println(res);

    }

    public static String remove (String str) {

        if (str.length() >= 2) {

            String firstChr = String.valueOf(str.charAt(0)), lastChar = String.valueOf(str.charAt(str.length() - 1));
            String removeFirstChar = str.replaceFirst(Pattern.quote(firstChr), "");
            return removeFirstChar.replaceFirst(Pattern.quote(lastChar), "");

        }

        return "";

    }

}
