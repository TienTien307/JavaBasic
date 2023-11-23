package BT_Array;

public class Bai9 {
    public static void main(String[] args) {
        int[] mangSoNguyen = {50, 1, 8, 3, 10, 9, 1};
        findSecondMax(mangSoNguyen);
    }

    public static void  findSecondMax(int[] array){
        int max =  Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println("Số max thứ 2 trong mảng là: " + secondMax);
    }
}
