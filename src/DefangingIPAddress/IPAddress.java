package DefangingIPAddress;

public class IPAddress {

    public static void main ( String[] args ) {

        String result = defangIPaddr("1.1.1.1");

        System.out.println( result );

    }

    public static String defangIPaddr(String address) {

        String value = address;

        for ( int index = 0; index < address.length(); index++ ) {

            if (address.charAt(index) == '.') value = address.replace( ".", "[.]");

        }

        return value;

    }

}
