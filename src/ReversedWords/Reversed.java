package ReversedWords;

public class Reversed {

    public static void main (String[] args) {

        String str = "The greatest victory is that which requires no battle";
        String result = reverseWords(str);

        System.out.println(result);

    }

    private static String reverseWords (String str){

        String [] split = str.split(" ");
        int splitLength = split.length, index = 0;
        String [] reversed = new String[splitLength];

        for (int i = splitLength - 1; i >= 0; i--) {

            reversed[index] = split[i];
            index++;

        }

        StringBuilder strBuilder = new StringBuilder();
        for (String word : reversed) {
            strBuilder.append(word);
            strBuilder.append(" ");
        }

        return strBuilder.toString().trim();

    }

}
