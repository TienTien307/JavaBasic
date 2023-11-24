package BT_Array;

import java.util.ArrayList;

public class Bai5 {
    // 5. Viết chương trình để tìm số chẵn đầu tiên trong một mảng số nguyên.
    public static void main(String[] args) {
        int[] mangSoNguyen = {1, 5, 90, 35, 45};

        timsochan2(mangSoNguyen);
//        System.out.printf("Số chẵn đầu tiên trong mảng là: " );
    }

//    public static int timSoChan(int[] mang){
//        int soChanDauTien = Integer.MIN_VALUE;
//        for(int soChan : mang ){
//            if (soChan % 2 == 0){
//                soChanDauTien = soChan;
//                return soChanDauTien;
//            }
//        }
//        return soChanDauTien;
//    }
    public static void timsochan2(int[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrayList.add(arr[i]);
            }
        }
        System.out.println("Tim so chan 2. So chan trong mang la: " + arrayList);

    }

}
