package ArrayList;

import java.util.ArrayList;

public class beautifulArray {
    public static void main(String[] args) {
        int n = 4;
        ArrayList <Integer> ls = new ArrayList<>();
        ls.add(1);
        ans(ls,n);

    }
    static void ans(ArrayList<Integer>ls,int n){
        while(ls.size() < n){
            ArrayList<Integer> m = new ArrayList<>();
            for(int i = 0; i < ls.size();i++){
                m.add(ls.get(i)*2);
                m.add(ls.get(i)*2-1);
            }
            ls = m;
        }
        System.out.println(ls);
        
    }
}
