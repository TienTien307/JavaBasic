package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        // create hashset
        Set<String> set = new HashSet<String>();  // Ko chứa giá trị trùng lặp

        // add object to hashset
        set.add("Java");
        set.add("C++");
        set.add("C#");
        set.add("PHP");
        set.add("PHP");
        //show set through iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }

        //show set through foreach
        System.out.println();
        for (String obj : set){
            System.out.println(obj + ", ");
        }
    }
}
