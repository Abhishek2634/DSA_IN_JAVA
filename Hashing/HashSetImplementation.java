
import java.util.*;
public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i <= 5000;i+=100){
            set.add(i);
        }
        // set.add(5);
        // set.add(4);
        // set.add(3);
        // set.add(9);
        // set.add(2);
        System.out.println(set);
        // System.out.println(set.size());
        // System.out.println(set.contains(2));
            // set.clear();
        // System.out.println(set.isEmpty());
        // System.out.println(set.size());


        //iteration  - using iterator
        // Iterator<Integer> it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        // using for each loop
        for(int m : set){
            System.out.print(m + " ");
        }

        

    }
}
