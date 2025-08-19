package HighestLowest;

public class HighestLowest {

    public static void main (String[] args) {

        String numbers = "1 2 3 4 5";
        System.out.println(highAndLow(numbers));

    }

    public static String highAndLow (String numbers) {

        String [] arr = numbers.split(" ");
        int [] intArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        boolean swapped = true;
        int temp, j = 0;

        while (swapped) {

            swapped = false;
            j++;

            for (int i = 0; i < intArr.length - j; i++) {
                if (intArr[i] > intArr[i+1]) {
                    temp = intArr[i];
                    intArr[i] = intArr[i+1];
                    intArr[i+1] = temp;
                    swapped = true;
                }
            }

        }



        return intArr[intArr.length - 1] + " " + intArr[0];

    }

}
