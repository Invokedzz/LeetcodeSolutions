package ScoreOfAString;

public class ScoreOfAString {

    public static void main ( String[] args ) {

        int result = scoreString( "hello");

        System.out.println( result );

    }

        private static int scoreString ( String element ) {

            int score = 0;

            for ( int index = 0; index < element.length() - 1; index++ ) {

                score += Math.abs(element.charAt( index ) - element.charAt( index + 1 ));

            }

            return score;

        }

}
