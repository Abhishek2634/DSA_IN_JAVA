package Arrays;
class MaxSubArraySum{
    public static void main(String[] args) {
        
        int arr[] = {-1,-4};
        kadanes(arr);
}

   static void bruteForce(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            for(int j = i;j < arr.length;j++){
                int sum = 0;
                for(int k = i ; k <= j ;k++){
                    sum += arr[k];
                }
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
}
   static void prefixSum(int arr[]){
            //prefix sum 
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];

        prefix[0] = arr[0];
        for(int i = 1;i < arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0;i < arr.length;i++){
            for(int j = i ; j < arr.length;j++){
                currSum = i == 0? prefix[j]:prefix[j]-prefix[i-1];
                maxSum = Math.max(maxSum,currSum);
            }
        }
        System.out.println("maxSum is "+ maxSum);

}
   static void kadanes(int arr[]){
                //kadanes Algo;
                int cs = 0;
                int ms = Integer.MIN_VALUE;
                for(int i = 0;i < arr.length;i++){
                    cs += arr[i];
                    if(cs > ms){
                        ms = cs;
                    }
                    if(cs < 0){
                        cs = 0;
                    }
                }
                System.out.println("maxSum is "+ms);
    }
}