package binary;

public class fastExponentiation {
  public static void main(String[] args) {
    int a = 2;
    int n = 10;
    int pow = 0;
    int ans = 1;

    while( n > 0){
        int rem = n % 2;
        if(rem == 1){
            ans *= Math.pow(a,Math.pow(2,pow));
        }
        pow++;
        n/=2;
    }
    System.out.println(ans);
    another();
  }
  static void another(){
    int a = 3;
    int n = 5;
    int ans = 1;
    while(n > 0){
        if((n & 1) != 0){
            ans *= a;
        }
        a*=a;
        n>>=1;
    }
    System.out.println(ans);
  }
}
