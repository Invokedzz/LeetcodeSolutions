package IsUppercase;

public class IsUppercase {

    public static void main (String[] args) {

        String s = "C";
        boolean isValid = isUpperCase(s);
        System.out.println(isValid);

    }

    public static boolean isUpperCase (String s) {

        String replaceBlankSpaces = s.replace(" ", "");
        int phraseLength = replaceBlankSpaces.length();

        for (int i = 0; i < phraseLength; i++) {

            char letter = replaceBlankSpaces.charAt(i);

            if (Character.isLowerCase(letter)) return false;

        }

        return true;

    }

}
