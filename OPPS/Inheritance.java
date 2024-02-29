package OPPS;

public class Inheritance {
    public static void main(String[] args) {
        // Fish f1 = new Fish();
        // f1.eats();
        // f1.name = "Shark";
        // System.out.println(f1.name);

        Dog sheru = new Dog();
        sheru.legs = 4;
        System.out.println(sheru.legs);
        sheru.breed = "lebra";
        System.out.println(sheru.breed);
        sheru.eats();


    }
}

//parent class
class Animal{
    String name ;

    void eats(){
        System.out.println("i am eating");
    }

    void sleep(){
        System.out.println("sleeping");
    }
}

//child class
class Fish extends Animal{  
    String name ;
    void swim(){
        System.out.println("can swim");
    }
}

class Mammal extends Animal{ //child class of animal class.    single level inheritance.
    int legs;
}
// here Mammal and fish class extends Animal class this is an example of hierarchial inheritance.
class Dog extends Mammal{ // multi level inheritance.
    String breed;
}