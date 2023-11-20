package BT_JavaBasic;

import java.util.ArrayList;

public class BtForArray {
    //     static void soChan(int n){
//        for (int i = 0; i <= 50 ; i+=2){
//            System.out.println(i);
//        }
//    }
    public static void main(String[] args) {
        int[] soChan = new int[26];
        int index = 0; // vị trí cho mảng
        for (int i = 0; i <= 50; i += 2) {
            soChan[index] = i;
            index++;
        }
//        System.out.println(soChan);
        //duyệt mảng
        for (int j = 0; j < soChan.length; j++) {
            System.out.println(soChan[j]);
        }
    }
}
