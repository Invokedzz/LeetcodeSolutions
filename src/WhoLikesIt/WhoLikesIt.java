package WhoLikesIt;

public class WhoLikesIt {

    public static void main (String[] args) {

        String [] arr = {};
        System.out.println(whoLikesIt(arr));

    }

    public static String whoLikesIt (String... names) {

        int arrLength = names.length;

        String message;

        switch (arrLength) {

            case 0:
                message = "no one likes this";
                break;

            case 1:
                message = names[0] + " likes this";
                break;

            case 2:
                message = names[0] + " and " + names[1] + " like this";
                break;

            case 3:
                message = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;

            default:
                int alterArrLength = arrLength - 2;
                message = names[0] + ", " + names[1] + " and " + alterArrLength + " others like this";
                break;

        }

        return message;

    }

}
