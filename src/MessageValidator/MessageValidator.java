package MessageValidator;

import java.util.Arrays;

public class MessageValidator {

    public static void main (String[] args) {

        String msg = "2hi2";
        boolean res = isAValidMessage(msg);

        System.out.println(res);

    }

    private static boolean isAValidMessage (String message) {

        if (message.isEmpty()) return true;
        String [] splitMsg = message.split("(?<=\\d)(?=\\D)|(?=\\d)(?<=\\D)");
        if (splitMsg.length % 2 != 0) return false;
        System.out.println(Arrays.toString(splitMsg));
        int k = 0;

        for (int i = 0; i < splitMsg.length; i++) {

            i++;
            if (!splitMsg[k].matches("-?\\d+(\\.\\d+)?") || splitMsg[i].matches("-?\\d+(\\.\\d+)?")) return false;
            int number = Integer.parseInt(splitMsg[k]); String word = splitMsg[i];
            if (number != word.length()) return false;
            k+=2;

        }

        return true;

    }

}
