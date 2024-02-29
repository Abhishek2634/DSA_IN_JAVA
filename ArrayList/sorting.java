package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
    ArrayList <Integer>list = new ArrayList<>();
    list.add(1); //t.c = O(1);
    list.add(2);
    list.add(3);
    list.add(4);

    Collections.sort(list); // ascending order
    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    }
}
