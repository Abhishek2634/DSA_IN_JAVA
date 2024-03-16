import java.util.*;
public class LinkedHashMapInJava {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("china",100);
        lhm.put("india",1);
        lhm.put("pak",1);
        System.out.println(lhm);

        // order will be maintained in linkedhashset.
        // inner implementation is in the form of a doubly linked list in an array.
    }
}
