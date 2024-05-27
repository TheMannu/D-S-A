import java.util.*;

public class HashMapFuntion
{
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        //functionality of put function
        hashmap.put(1, "Ashwani");
        hashmap.put(2, "Mannu");
        hashmap.put(3, "tannu");
        hashmap.put(4,"Appu");

        System.out.println(hashmap);

        //FUNCTIONALITY of get function
        //String result = hashmap.get(3);
        System.out.println(hashmap.get(4));

        // functionality of contains key
        System.out.println(hashmap.containsKey(2));


        // functionality of remove function
        hashmap.remove(3);
        System.out.println(hashmap);

        //iterating using the for loop
        for(Map.Entry<Integer,String> e: hashmap.entrySet()){
            System.out.println("hashmap is :");
            System.out.println(e.getKey() + " : " +e.getValue());
        }
    }
}
