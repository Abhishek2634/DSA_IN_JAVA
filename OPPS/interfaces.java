package OPPS;

public class interfaces {
    public static void main(String[] args) {
        queen q = new queen();
        q.move();


        crow c1 = new crow();
        c1.setName("blaky");
        System.out.println(c1.name);
        c1.herbiFood();
        c1.carniFood();
    }
}

interface Herbivore{
    void herbiFood();
}

interface Carnivore{
    void carniFood();

}

class crow implements Herbivore,Carnivore{
     // this is example of multiple inheritance in java
    String name ;
    void setName(String s){
        this.name = s;
    }
    public void herbiFood(){
        System.out.println("i m herbivore");
    }
    public void carniFood(){
        System.out.println("i am carnivore");
    }
}




interface chessPlayer{
    void move();   // this method is by default abstract and public.
}

class queen implements chessPlayer{
    public void move(){
        System.out.println("up, down, left, right, diagonally(in all directions)");
    }
}

class pawn implements chessPlayer{
    public void move(){
        System.out.println("up, diagonal");
    }
}

class King implements chessPlayer{
    public void move(){
        System.out.println("up, down, left, right, diagonal");
    }
}