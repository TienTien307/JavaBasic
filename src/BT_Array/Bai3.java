package BT_Array;

import java.util.ArrayList;

public class Bai3 {
    //3. Viết một chương trình Lặp số từ 0 đến 50. Lưu những giá trị chẵn vào 1 mảng mới. Sau đó hiển thị mảng mới đó ra

    public static void main(String[] args) {
        int soChan[] = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i += 2) {
            soChan[index] = i;
            index++;
        }

        System.out.println("Mảng số chẵn từ 0 đến 50:");
        for (int so : soChan) {
            System.out.print(so + " ");
        }
    }
//    public static void timSoChan(int[] arr){
//
//        //arraylist
//        ArrayList<Integer> arraylist = new ArrayList<Integer>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arraylist.add(arr[i]);
//            }
//        }
//        System.out.println("mang so chan: " +arraylist);
//
//        }
//    }
}
