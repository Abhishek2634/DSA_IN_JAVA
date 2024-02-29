package BackTracking;

public class GridWays{
    public static int gridWays(int i,int j,int m,int n){
        //base case 
        if(i == n-1 || j == n-1){
            return 1;
        }
        if(i == n || j == n){
            return 0;
        }
        int w1 = gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);
        return w1 + w2;
    }
    public static void main(String[] args) {
        //t.c - O(2^m*n);
        int n = 4;//rows 
        int m = 4;//cols
        System.out.println(gridWays(0, 0, m, n));

    }
}