import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {

    public static void main(String[] args) {
//        Map<Integer, String> hashMap1 = new HashMap<>();
//        hashMap1.put(1, "A");
//        hashMap1.put(2, "B");
//        hashMap1.put(3, "C");
//        hashMap1.put(2, "D"); //Ghi đè lên key 2;
//
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap1 + "\n");
//
//        Map<Integer, String> treeMap1 = new TreeMap<>(hashMap1);
//        System.out.println("Display entries in TreeMap");
//        System.out.println(treeMap1 + "\n");

        Map<String, Integer> linkedHashMap1 = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap1.put("Smith", 30);
        linkedHashMap1.put("Anderson", 31);
        linkedHashMap1.put("Lewis", 29);
        linkedHashMap1.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap1.get("Lewis"));


    }

}
