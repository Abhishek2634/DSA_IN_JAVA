package Greedy;
public class LexiographicallySmallestStringOfLengthNAndSumK{
    public static void main(String[] args) {
        // We have two integers N and K.The task is to print the lexicographically smallest string of length N consisting of lower-case English alphabets such that the sum of the characters of the string equals to K where ‘a’ = 1, ‘b’ = 2, ‘c’ = 3, ..... and ‘z’ = 26.

        int n = 2;
        int k = 27;
        StringBuilder sb = new StringBuilder();
        while(n-- > 0){
            if(26 * (n)  >= k - 1){
                sb.append('a');
                k--;
            }else{
                if(k % 26 == 0){
                    sb.append('z');
                    k -= 26;
                }else{
                    sb.append((char)('a'+ (k % 26)-1));
                    k-=(k % 26);
                }
            }
        }
        System.out.println(sb.toString());
    }
}