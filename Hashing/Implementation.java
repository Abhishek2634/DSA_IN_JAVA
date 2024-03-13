import java.util.HashMap;
import java.util.Set;
public class Implementation{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("nepal",12);
        hm.put("pak",0);
        hm.put("china",1);

        Set<String> s = hm.keySet();
        System.out.println(s);

        for(String k : s ){
            System.out.println("key is "+ k +" value is "+hm.get(k));
        }

        // put (),get(),containsKey(),remove(),size(),clear()  --> all takes O(1) time.
    }
}