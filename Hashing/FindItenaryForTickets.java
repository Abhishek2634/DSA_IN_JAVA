
import java.util.HashMap;
public class FindItenaryForTickets {
    static String reverse(HashMap<String,String>abc){
        HashMap<String, String> happy = new HashMap<>();
        for(String s : abc.keySet()){
            happy.put(abc.get(s),s);
        }
        for(String s : abc.keySet()){
            if(!happy.containsKey(s)){
                return s;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String>map = new HashMap<>();
        map.put("Chennai","Bengluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String start = reverse(map);    
        System.out.print(start);
        int size = map.size();
        while(size -- > 0){
            System.out.print("--> " + map.get(start));
            start = map.get(start);
        }
    }
}
