package OPPS;

public class Static {
    public static void main(String[] args) {
        boy b1 = new boy();
        b1.setName("raj");
        System.out.println(b1.name);

        // System.out.println(b1.marks(90, 40, 70));

        // b1.schoolName = "abc";       //now school name is abc for every object.

        // boy b2 = new boy();
        // System.out.println(b2.schoolName);  
        // System.out.println(b1.marks(90, 90, 100));

    }
}

class boy{
    String name;
    int roll;
    static String schoolName;  //only created ones in the memory and all objects take the reference of this.

    static int marks(int phy, int che, int maths){
        return (phy + che + maths)/3;
    }
    void setName(String name){
        this.name = name;
    }
}