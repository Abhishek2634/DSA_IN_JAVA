public class Q1544 {
    public static void main(String[] args) {
        //make a great string from the existing string . great string is that which have no two adjacent characters which are uppercase as well as lowercase.

        String m = "leEeetcode";
        System.out.println(ans(m));
    }
    public static String ans(String m){
        if(m.length() == 0 || m.length() == 1) return m;
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(m);

        while(idx < sb.length() - 1){
            int first = sb.charAt(idx);
            int last = sb.charAt(idx + 1);

            if(Math.abs(first - last) == 32){
                sb.delete(idx, idx + 2);
                if(idx > 0) idx--;
            }
            else{
                idx++;
            }
        }
        return sb.toString();
    }
}
