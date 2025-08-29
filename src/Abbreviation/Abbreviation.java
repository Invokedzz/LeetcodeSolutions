package Abbreviation;

public class Abbreviation {

    public static void main (String[] args) {

        String str = "cat sits; mat. mat, on_cat: doggy-monolithic5mat, cat";
        String res = abbreviate(str);

        System.out.println(res);

    }

    private static String abbreviate (String string) {

        String abbreviate = "";
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            char letter = string.charAt(i);

            if (Character.isLetter(letter)) {

                abbreviate += letter + "";

            } else {

                if (abbreviate.length() >= 4) {

                    int removedLetters = abbreviate.length() - 2;
                    strBuilder.append(abbreviate.charAt(0))
                            .append(removedLetters)
                            .append(abbreviate.charAt(abbreviate.length() - 1));

                } else {

                    strBuilder.append(abbreviate);

                }

                abbreviate = "";
                strBuilder.append(letter);

            }

        }

        if (abbreviate.length() >= 4) {
            int removedLetters = abbreviate.length() - 2;
            strBuilder.append(abbreviate.charAt(0))
                    .append(removedLetters)
                    .append(abbreviate.charAt(abbreviate.length() - 1));
        } else {
            strBuilder.append(abbreviate);
        }

        return strBuilder.toString().trim();

    }

}
