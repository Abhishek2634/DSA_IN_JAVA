import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedHashSetInJava {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abhi");
        set.add("ramu");
        set.add("happpy");
        set.add("don");
        System.out.println(set);

        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("abhi");
        lhs.add("ramu");
        lhs.add("happpy");
        lhs.add("don");
        System.out.println(lhs);

    }
}
