package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        Map<String, String> list = new HashMap<>();
        list.put("USA", "Ny");
        list.put("Canada", "Torronto");

        for(Map.Entry entry:list.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
