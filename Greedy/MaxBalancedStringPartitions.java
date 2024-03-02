package Greedy;

public class MaxBalancedStringPartitions {
    public static void sol(String str){
        int Lcount = 0;
        int Rcount = 0;
        int ans = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == 'L'){
                Lcount++;
            }else{
                Rcount++;
            }
            if(Lcount == Rcount){
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // We have balanced string str of size N with an equal number of L and R,the task is to find a maximum number X, such that a given string can be partitioned into X balanced substring.A string is called to be balanced if the number of ‘L’s in the string equals the number of ‘R’s

        String str = "LRRRRLLRLLRL";
        sol(str);
    }
    
}
