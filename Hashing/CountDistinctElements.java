
import java.util.HashSet;
public class CountDistinctElements {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet <Integer>hs = new HashSet<>();
        for(int a : arr){
            hs.add(a);
        }
        System.out.println(hs.size());
    }
}
