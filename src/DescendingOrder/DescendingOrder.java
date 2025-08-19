package DescendingOrder;

public class DescendingOrder {

    public static void main (String[] args) {

        int num = 123456789;
        int result = sortDesc(num);
        System.out.println(result);

    }

    public static int sortDesc (final int num) {

        String value = String.valueOf(num);
        int [] arr = new int[value.length()];

        for (int i = 0; i < value.length(); i++) {
            char chr = value.charAt(i);
            int x = chr - '0';
            arr[i] = x;
        }

        boolean swapped = true;
        int temp, j = 0;

        while (swapped) {

            swapped = false;
            j++;

            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }

        }

        String str = "";
        for (int k : arr) {
            str += k;
        }

        return Integer.parseInt(str);

    }

}
