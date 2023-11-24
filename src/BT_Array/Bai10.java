package BT_Array;

import java.util.ArrayList;
import java.util.Random;

public class Bai10 {
    //10. Viết chương trình để lấy ra số nguyên tố trong mảng cho trước.

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13, 16};

        ArrayList<Integer> mangSoNguyenTo = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            boolean isSoNguyenTo = true;
            for (int j = 2; j <= array[i] - 1; j++) {
                if (array[i] % j == 0) {
                    isSoNguyenTo = false;
                    continue;
                }
            }

            if (isSoNguyenTo) {
                mangSoNguyenTo.add(array[i]);
            }
        }

        System.out.println("So nguyen to trong mang la: " + mangSoNguyenTo);
    }


}
