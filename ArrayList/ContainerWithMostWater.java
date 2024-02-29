package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        //1 8 6 2 5 4 8 3 7;

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        brute(list);
        twoPointer(list);

    }
    static void brute(ArrayList<Integer>list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size()-1;++i){
            for(int j = i + 1; j < list.size();j++){
                max = max > (j - i) * (Math.min(list.get(i),list.get(j)))? max : (j - i) * (Math.min(list.get(i),list.get(j)));
            }
        }
        System.out.println(max);
    }
    static void twoPointer(ArrayList<Integer>list){
        int rt = list.size()-1;
        int lt = 0;
        int area = 0;
        while(rt > lt){
            int ht = Math.min(list.get(rt),list.get(lt));
            int width = rt-lt;
            area = area > ht*width? area : ht*width;
            if(list.get(rt) > list.get(lt)){
                lt++;
            }else {
                rt--;
            }
        }
        System.out.println(area);
    }
}
