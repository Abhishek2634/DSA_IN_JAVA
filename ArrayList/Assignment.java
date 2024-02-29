package ArrayList;

import java.util.ArrayList;

public class Assignment {
    public static void main(String[] args) {
        //monotonic arraylist
       // eg: [1,2,2,4]   or [6,5,4,4]  either inc. or dec.

       ArrayList <Integer> list = new ArrayList<>();
       list.add(1);
       list.add(3);
       list.add(2);
       list.add(4);
       boolean val = asc(list);
       boolean val1 = des(list);
       System.out.println(val || val1);
    }
    static boolean asc(ArrayList <Integer> ls){
        boolean m = true;
        for(int i = 0 ; i < ls.size()-1;i++){
            if(ls.get(i) > ls.get(i+1) ){
                m = false;
            }
        }
        return m;
    }
    static boolean des(ArrayList <Integer> ls){
        boolean s = true;
        for(int i = 0 ; i < ls.size()-1;i++){
            if(ls.get(i)  < ls.get(i+1)){
                s = false;
            }
        }
        return s;
    }
}
