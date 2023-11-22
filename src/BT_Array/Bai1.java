package BT_Array;

public class Bai1 {
    //1. Viết một chương trình tính tổng của các phần tử trong một mảng số nguyên.

    public static int tinhTong(int[] mang) {
        int tong = 0;

        for (int soNguyen : mang) {
            tong += soNguyen;
        }
        return tong;
    }

    public static void main(String[] args) {
        int mangSoNguyen[] = {10, 2, 3, 40, 5};

        int tong = tinhTong(mangSoNguyen);
        System.out.println("Tổng các các phần tử trang 1 mảng: " +tong);

    }

}
