import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class typesOfMaps{
    public static void main(String[] args) {

        // unordered return type
        HashMap <Integer,String> map = new HashMap<>();
        map.put(2,"ajay");
        map.put(7,"tarun");
        map.put(5,"arjun");
        map.put(1,"tannu");

        System.out.println("HashMap class "+ map);
        
        //order of insertation is retained
        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(2,"ajay");
        map1.put(7,"tarun");
        map1.put(5,"arjun");
        map1.put(1,"tannu");

        System.out.println("LinkedHashMap class" + map1);

        //sorted order on the basis of key
        TreeMap <Integer,String> map2 = new TreeMap<>();
        map2.put(2,"ajay");
        map2.put(7,"tarun");
        map2.put(5,"arjun");
        map2.put(1,"tannu");

        System.out.println( "Treee Map class" +map2);
    }
}
