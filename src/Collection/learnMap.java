package Collection;

import java.util.HashMap;
import java.util.Map;

public class learnMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put ("Window", "2000");
        hashMap.put ("Window", "XP");
        hashMap.put ("Language1", "Java");
        hashMap.put ("Language2", "C++");

        System.out.println("các phần tử của map:");
        System.out.print("\t" + hashMap);

        System.out.println("");
        System.out.println(hashMap.get("Window"));
    }
}
