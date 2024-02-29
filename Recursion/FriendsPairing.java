package Recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
    static int pairing(int n){
        //find no. of ways to pair n friends in a party.Each friend can be paired once.find no. of ways
        // in which friends can be remain single or paired up 
        //base case
        if(n == 1 || n == 2) return n;
        //choice
        //Single:
        int fnm1 = pairing(n-1);
        //pair
        int fnm2 = pairing(n-2);

       // pairWays:
       int pairWays = (n-1) * fnm2;

       int totalWays = pairWays + fnm1;
       return totalWays;

    }
}
