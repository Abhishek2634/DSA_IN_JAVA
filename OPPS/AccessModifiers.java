package OPPS;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.userName = "Abhishek";
        System.out.println(b1.userName);

        b1.changePass("hello123");
    }
}

class BankAccount{
   public String userName;
   private String password; //cannot access the value outside the current class but can change using the function.

   void changePass(String setPass){
    this.password = setPass;
    System.out.println(password);
   }
}
