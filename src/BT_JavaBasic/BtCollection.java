package BT_JavaBasic;

import java.util.*;

public class BtCollection {

    public static void main(String[] args) {
        List<Integer> soChan = new ArrayList<>();
        for (int i = 0; i <= 50; i+= 2) {
            soChan.add(i);
        }
        //foreach
//        for (int number : soChan){
//            System.out.println(number);
//        }
        Iterator<Integer> num = soChan.iterator();
        while (num.hasNext()){
            System.out.println(num.next());
        }

//        List<String> Sinhvien = new ArrayList<>();
//        Sinhvien.add("TienNT");
//        Sinhvien.add("20");
//        Sinhvien.add("Tester");
//        Sinhvien.add("HN");
//        System.out.println();
//        int size = Sinhvien.size();
//        for (int i = 0; i < size; i++){
//            System.out.println(Sinhvien.get(i));
//        }

        Set<String> Sinhvien = new HashSet<>(); //ko chứa trùng lặp
        Sinhvien.add("TienNT");
        Sinhvien.add("20");
        Sinhvien.add("Tester");
        Sinhvien.add("HN");
        System.out.println();
        for (String s : Sinhvien){
            System.out.println(s);
        }
    }
}
