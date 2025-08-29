package MiddleCharacter;

public class MiddleCharacter {

    public static void main (String[] args) {

        String word = "test";
        String result = getMiddle(word);

        System.out.println(result);

    }

    public static String getMiddle (String word) {

        int mid = word.length() / 2;
        char guess = word.charAt(mid);
        String result = "";

        if (word.length() % 2 == 0) {
            mid = mid - 1;
            result += word.charAt(mid);
            result += guess;
            return result;
        }

        result += guess;
        return result;

    }

}
