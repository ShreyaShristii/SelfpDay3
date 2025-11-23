import java.util.*;
public class HashMapP {
    public static void main(String args[]){
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Apple",30);
        map.put("Mango",50);
        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("Banana"));
        map.remove("Mango");
        for(String key : map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
    
}
