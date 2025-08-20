package ListFiltering;

import java.util.List;

public class ListFiltering {

    public static void main (String[] args) {

        List <Object> list = List.of(1, 2, "a", "b");
        List <Object> result = filterList(list);

        System.out.println(result);

    }

    public static List <Object> filterList (final List <Object> list) {
        return list.stream().filter(x -> x.getClass().equals(Integer.class)).toList();
    }

}
