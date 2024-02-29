package OPPS;


public class superClass {
    public static void main(String[] args) {
        abhi a = new abhi();
        System.out.println(a.color);
    }
}


class bro {
    String color;
    bro(){
        System.out.println("hii i am bro , parent constructor");
    }
}

class abhi extends bro{
    abhi(){
        super();
        super.color = "brown";
        System.out.println("hii i am abhi, child constructor");
    }
}