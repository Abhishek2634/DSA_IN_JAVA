package revision;

public class hollowRectangle {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= n;j++){
                if(j==1||i==1||i==m||j==n){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
