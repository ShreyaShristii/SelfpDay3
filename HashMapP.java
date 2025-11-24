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
        Frequency();
    }
    public static void Frequency(){
        int[] arr={1,2,3,4,64,2,2,3,64};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            Integer oldvalue=map.get(num);
            if(oldvalue==null){
                map.put(num,1);
            }
            else{
                map.put(num,oldvalue+1);
            }


        }
        System.out.println("Araay is"+map);

    }
    
}
