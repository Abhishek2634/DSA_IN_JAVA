package sorting;
class rev{
    public static void main(String[] args) {
        int arr []={3,-3,-2,6,5};
        prefix(arr);
    }
    static void prefix (int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            for(int j = i ;j < arr.length;j++){
                int sum = 0;
                for(int k = i; k <= j ;k++){
                    sum += arr[k];
                }
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
}