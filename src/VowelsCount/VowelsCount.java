package VowelsCount;

public class VowelsCount {

    public static void main (String[] args) {
        String str = "abracadabra";
        int res = getCount(str);
        System.out.println(res);
    }

    private static int getCount(String str) {

        int count = 0;
        char chr;

        for (int i = 0; i < str.length(); i++) {
            chr = str.charAt(i);
            switch (chr) {
                case 'a', 'e', 'i', 'o', 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }

        return count;

    }

}
