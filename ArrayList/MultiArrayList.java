package ArrayList;

import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);

        main.add(list1);
        main.add(list2);
        System.out.println(main);

        for(int i = 0; i < main.size();++i){
            ArrayList <Integer> curr = main.get(i);
            for(int j = 0; j < curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        
        hello();
    }
    static void hello(){
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        for(int i = 1 ; i <= 5;++i){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }
        main.add(list1);
        main.add(list2);
        main.add(list3);
        list2.remove(3);


        for(int i = 0; i < main.size();++i){
            ArrayList<Integer> ls = main.get(i);
            for(int j = 0; j < ls.size();++j){
                System.out.print(ls.get(j)+ " ");

            }
            System.out.println();
        }





    }
}
