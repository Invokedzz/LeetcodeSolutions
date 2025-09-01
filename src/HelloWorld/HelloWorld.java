package HelloWorld;

public class HelloWorld {

    public static void main (String[] args) {

        SayHelloServiceImpl helloService = new SayHelloServiceImpl();
        String result = helloService.greet();

        System.out.println(result);

    }

    public static class SayHelloServiceImpl implements SayHelloService {

        @Override
        public String greet () {

            return GREETINGS;

        }

    }


    public interface SayHelloService {

        String GREETINGS = "hello world";

        String greet ();

    }

}
