package AlternatingCase;

public class AlternatingCase {

    public static void main (String[] args) {

        String str = "altERnaTIng cAsE <=> ALTerNAtiNG CaSe";

        String result = toAlternativeString(str);

        System.out.println(result);

    }

    public static String toAlternativeString (String string) {

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            char chr = string.charAt(i);
            if (Character.isUpperCase(chr)) {
                strBuilder.append(Character.toLowerCase(string.charAt(i)));
            } else if (Character.isLowerCase(chr)) {
                strBuilder.append(Character.toUpperCase(string.charAt(i)));
            } else if (Character.isWhitespace(chr)) {
                strBuilder.append(" ");
            } else {
                strBuilder.append(chr);
            }
        }

        return strBuilder.toString();

    }

}
