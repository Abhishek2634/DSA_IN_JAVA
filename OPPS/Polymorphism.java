package OPPS;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));// Method overloading.  compile time polymorphism
        System.out.println(c.sum(1,2,3));
        System.out.println(c.sum(1.34f,2.65f));

        // Method overriding.
        Deer d1 = new Deer();
        d1.eats();

    }
}

class janwar{
   void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends janwar {
    // void eats(){
    //     System.out.println("eats grass");
    // }
}
class Calculator{
    int sum (int a,int b){
        return a + b;
    }
    int sum (int a, int b,int c){
        return a + b + c;
    }
    float sum (float a, float b){
        return a + b;
    }
}
