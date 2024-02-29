package OPPS;

public class Classes {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //creating object of pen class;
        p1.setColor("yellow"); //change values through functions;
        System.out.println(p1.color);
        p1.setTip(7);
        System.out.println(p1.tip);

        //creating object of student class;
        Student s1 = new Student();
        s1.name = "happy"; //directly change name without using function using = operator
        s1.percentage(85, 94, 91);
        System.out.println(s1.cgpa);

    }
}

//classes are blueprint of object containing functions and properties.
//objects are entities of classes .
class Pen{
 String color;
 int tip;


void setColor(String s){
    this.color = s;
}

void setTip (int n){
    this.tip = n;
}

}




class Student{
String name ;
int cgpa;

void percentage(int phy, int chem, int maths){
   this.cgpa =  (phy + chem + maths) * 100 / 300;
}

void changeName(String newName){
    this.name = newName;
}

}
