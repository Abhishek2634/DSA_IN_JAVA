import java.util.ArrayList;

public class MethodsForHeap {
    public static class Heap{
        ArrayList<Integer>ls = new ArrayList<>();
        public void add(int data){// t.c = O(logN);
            //add at last index
            ls.add(data);
            int x = ls.size() - 1; // x is child index.
            int par = (x - 1)/2; // parent index
            while(ls.get(x) < ls.get(par)){ // condition for min Heap
                //swap
                int tmp = ls.get(x);
                ls.set(x,ls.get(par));
                ls.set(par,tmp);

                x = par;
                par = (x - 1)/2;
            }
        }
        public int peek(){
            return ls.get(0);
        }

        private void heapify(int i){ // fix the heap
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if(left < ls.size() && ls.get(minIdx) > ls.get(left)){
                minIdx = left;
            }
            if(right < ls.size() && ls.get(minIdx) > ls.get(right)){
                minIdx = right;
            }
            if(minIdx != i){
                //swap
                int tmp = ls.get(i);
                ls.set(i,ls.get(minIdx));
                ls.set(minIdx,tmp);
                heapify(minIdx);
            }
        }
        public int remove(){// remove min element from heap
            int data = ls.get(0);
            //step 1-> swap first and last
            int tmp = ls.get(0);
            ls.set(0,ls.get(ls.size()-1));
            ls.set(ls.size()-1,tmp);

            //step 2 -> delete last;
            ls.remove(ls.size() - 1);

            //step 3  heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return ls.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(6);
        h.add(2);
        h.add(7);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
