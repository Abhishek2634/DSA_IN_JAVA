package Strings;

class builder{
public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char i = 'a'; i <= 'z';i++){
            sb.append(i+" ");
        }
        System.out.println(sb.toString());
    }
}

//using append instead of += in Strings save time to execute a programme,
