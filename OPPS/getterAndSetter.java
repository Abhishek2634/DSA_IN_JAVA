package OPPS;

public class getterAndSetter {
    public static void main(String[] args) {
        Pencil p1 = new Pencil(); //creating object of pencil class;
        p1.setColor("green"); //change values through functions;
        System.out.println(p1.getColor());
        p1.setTip(7);
        System.out.println(p1.getTip());
    }
}

class Pencil{
    private String color;
    private int tip;


    String getColor(){  // used to acess the value no matter it is private or anything ;
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    
    void setColor(String s){
        this.color = s;
    }
    
    void setTip (int n){    //setter fucntion change the value 
        this.tip = n;
    }
    
    }
