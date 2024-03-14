import java.util.PriorityQueue;

public class WeakestSoldier {
    public static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        Row(int soldier,int i){
            this.soldier = soldier;
            this.idx = i;
        };
        @Override
        public int compareTo(Row r2){
            if(this.soldier == r2.soldier){
                return this.idx - r2.idx;
            }else{
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
        };  

        PriorityQueue<Row>pq = new PriorityQueue<>();

        int k = 2; // find k weakest soldier
        for(int i = 0; i < army.length;i++){
            int soldier = 0;
            for(int j = 0;j < army[i].length;j++){
                if(army[i][j] == 1){
                    soldier ++;
                }
            }
            pq.add(new Row(soldier ,i));
        }

        for(int i = 0; i < k; i++){
            System.out.println(pq.remove().idx);
        }
    }
}
