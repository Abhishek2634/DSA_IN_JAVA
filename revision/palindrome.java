package revision;
class paalindrome{
    public static void main(String[] args) {
        int num = 121;
       int rev = check(num);
       if(rev == num){
          System.out.println("its a palindrome");
       }else{
        System.out.println("its not a palindrome");
       }
    }
    static int check(int no){
        int rev = 0;
        while(no != 0){
            rev = rev*10+no%10;
            no/=10;
        }
        return rev;
    }
}