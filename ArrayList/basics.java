package ArrayList;
import java.util.ArrayList;

public class basics {
   public static void main(String[] args) {
    // note 
    // Arraylist stores non primitive data types 
    ArrayList <Integer>list = new ArrayList<>();
    list.add(1); //t.c = O(1);
    list.add(2);
    list.add(3);
    list.add(4);

    list.add(0,6); // t.c O(n)

    System.out.println(list);
    System.out.println(list.get(2));  // t.c -- O(1)
    list.remove(2);// t.c = O(n)
    System.out.println(list);

    list.set(2,10);//t.c:  O(N);
    System.out.println(list);

    boolean b = list.contains(12);//t.c = O(n) ; check whether true of false
    System.out.println(b);


    System.out.println(list.size());
    for(int i = 0; i < list.size();i++){
        System.out.print(list.get(i)+" ");
    }

    }
}
