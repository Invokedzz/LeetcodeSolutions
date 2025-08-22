package Pangram;

public class Pangram {

    public static void main (String... args) {

        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isAPangram = check(sentence);

        System.out.println(isAPangram);

    }

    public static boolean check (String sentence) {

        String convertSentenceToLowerCase = sentence.toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char c : alphabet) {

            if (!convertSentenceToLowerCase.contains("" + c)) {
                return false;
            }

        }

        return true;

    }

}
