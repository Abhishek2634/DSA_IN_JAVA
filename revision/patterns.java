package revision;

import java.util.Scanner;

class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
     int nol = 1;
     int sp = n-1;
     int st = 1;
     while (nol <= n) {

        for(int i = 1;i <= sp;i++){
            System.out.print(" ");
        }
        int current = nol;
        for(int i = 1;i <= st;i++){
            System.out.print(current);
            if(i > st/2){
                current++;
            }else{
                current--;
            }
        }
        nol++;
        sp--;
        st+=2;
        System.out.println();

    
     }
    }

}