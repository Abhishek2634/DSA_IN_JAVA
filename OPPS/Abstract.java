package OPPS;

public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.walk();
        h.eat();
        c.eat();
        c.walk();

        // h.changeCol();
        // System.out.println(h.color);

        Mustang M = new Mustang();
        System.out.println(M.color);
        //animals --> Horse -->  Mustang : constructor of animals is called first.
    }
}

 abstract class animals{ // cannot make object of this.
    String color;
    animals(){   // constructors. of parent class will execute first when an object of child class be made. then child class constructor will be called.
        color = "brown";   //initialising variables for child class.
        System.out.println("animal constructor called");
    }
    void eat(){ // non - abstract method
        System.out.println("animal will eat");
    }
    abstract void walk(); // abstract method  just give and idea to the child class not the implementation.
}

class Horse extends animals{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeCol(){
        color = "green";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

class Chicken extends animals{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}