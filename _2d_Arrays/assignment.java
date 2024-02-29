package _2d_Arrays;

public class assignment {
    static void count7(int arr[][]){
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static void sum(int arr[][]){
        int sum = 0;
        for(int i = 0;i < arr[1].length;i++){
            sum += arr[1][i];
        }
        System.out.println(sum);
    }
    static void transpose (int arr[][]){
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1; j < arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0;i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7},{9,5,4}};
        int newArr [][] =  {{1,4,9},{11,4,3},{2,2,3}};
        count7(arr);
        sum(newArr);
        transpose(arr);

    }
}
