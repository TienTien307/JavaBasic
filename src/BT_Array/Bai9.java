package BT_Array;

public class Bai9 {
    public static void main(String[] args) {
        int[] mangSoNguyen = {50, 1, 8, 3, 10, 90, 1};
        findSecondMax(mangSoNguyen);
    }

    public static void  findSecondMax(int[] array){
        int max =  Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : array) {
            if(value > max){
                secondMax = max;
                max = value;
            }else if(value > secondMax){
                secondMax = value;
            }
        }
        System.out.println("Số max thứ 2 trong mảng là: " + secondMax);
    }
}
