package EncodeDuplicates;

import java.util.HashMap;
import java.util.Map;

public class EncodeD {

    public static void main (String[] args) {

        String word = "Success";
        String result = encode(word);

        System.out.println(result);

    }

    static String encode (String word) {

        String result = "";
        Map <Character, Integer> map = new HashMap<>();
        char [] arr = word.toLowerCase().toCharArray();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        for (int i = 0; i < arr.length; i++) {

            if (map.get(arr[i]) > 1) {
                result += ")";
            }

            else result += "(";

        }

        return result;
    }

}
