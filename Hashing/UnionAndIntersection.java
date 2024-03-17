import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer>set1 = new HashSet<>();        
        HashSet<Integer>set2 = new HashSet<>();        

        // finding union;
        int i = 0;
        int j = 0;
        while(i < arr1.length){
            set1.add(arr1[i++]);
        }
        while(j < arr2.length){
            set1.add(arr2[j++]);
        }
        System.out.println("union is : ");
        System.out.println(set1);
        System.out.println(set1.size());
        set1.clear();

        // intersection
        i = 0;
        while(i < arr1.length){
            set1.add(arr1[i++]);
        }
        for(int s : arr2){
            if(set1.contains(s)){
                set2.add(s);
            }
        }
        System.out.println("intersection is");
        System.out.println(set2.size());
        System.out.println(set2);

    }
}
