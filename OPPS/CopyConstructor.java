package OPPS;

public class CopyConstructor {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.name = "Abhi";
        s1.roll = 21;
        s1.pass = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
         // s1 forget his pass and we will make new object for s1 (s2) to take his password .copy constructor will copy all the properties of s1 to s2;

        Stu s2 = new Stu(s1);//making copy constructor of s1;
        s2.pass = "xyz";

        s1.marks[0] = 50;

        for(int n : s2.marks){
            System.out.println(n);
        }
        System.out.println(s2.name);
        
    }
}

class Stu{
    String name;
    int roll;
    String pass;
    int marks[];

    //shallow copy constructor.
    // Stu(Stu s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor.
    Stu(Stu s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }


    Stu(){
        marks = new int[3];
        System.out.println("hello ...");
    }

}