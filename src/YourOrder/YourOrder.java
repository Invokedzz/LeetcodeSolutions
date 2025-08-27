package YourOrder;

public class YourOrder {

    public static void main (String[] args) {

        String words = "is2 Thi1s T4est 3a";
        String res = order(words);

        System.out.println(res);

    }

    public static String order (String words) {

        if (words.isEmpty()) {
            return "";
        }

        String [] getAllNumbersFromWords = words.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        String [] splitWords = words.split(" ");
        int [] numericalValues = new int[getAllNumbersFromWords.length];

        for (int i = 0; i < numericalValues.length; i++) {
            numericalValues[i] = getAllNumbersFromWords[i].charAt(0) - '0';
        }

        boolean swap = true;
        int temp, j = 0;
        String temp2;

        while (swap) {

            swap = false;
            j++;

            for (int i = 0; i < numericalValues.length - j; i++) {

                if (numericalValues[i] > numericalValues[i + 1]) {

                    temp = numericalValues[i + 1];
                    temp2 = splitWords[i + 1];
                    numericalValues[i + 1] = numericalValues[i];
                    splitWords[i + 1] = splitWords[i];
                    numericalValues[i] = temp;
                    splitWords[i] = temp2;
                    swap = true;

                }

            }

        }

        String result = "";
        for (String word : splitWords) {

            result += word + " ";

        }

        return result.trim();

    }

}
