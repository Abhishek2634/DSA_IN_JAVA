package ArrayList;

import java.util.ArrayList;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(5);
        ls.add(9);
        ls.add(3);
        ls.add(6);

        System.out.println(ls);
        int idx = 1;
        int idx2 = 3;

        //swap;
        int tmp = ls.get(idx);
        ls.set(idx,ls.get(idx2));
        ls.set(idx2,tmp);
        System.out.println(ls);
    }
}
