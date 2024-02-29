package OPPS;


public class Consturctors {
    public static void main(String[] args) {

        //constructors: they are special methods that dont have any return type and the same name as of the class name they are used to initialized the instance variables of the object.
        Child c3 = new Child();
        Child c1 = new Child("abhi",23);
        Child c2 = new Child("raj");
        
        System.out.println(c1.name);
        System.out.println(c1.roll);
        System.out.println(c2.name);
        System.out.println(c3);
        System.out.println(c2.get());
    }
}

class Child{
String name;
int roll;


String get(){
    return name;
}
//constructors overloading // example of polymorphism
Child(String name,int roll){
    this.name = name;
    this.roll = roll;
}
Child(String name){
    this.name = name;
}
Child(){
System.out.println("hello i am farswal");
}

}
