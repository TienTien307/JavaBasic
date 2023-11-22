package BT_Array;

public class Bai2 {
    //2. Viết chương trình tìm giá trị lớn nhất trong một mảng số nguyên.

    public static void main(String[] args) {

        int mangSoNguyen[] = {10, 2, 3, 40, 5};

        int giaTriMax = Max(mangSoNguyen);
        System.out.println("Giá trị lớn nhất trong mảng là: " + giaTriMax);

    }
    public static int Max(int[] mang) {
        int giatriMax = mang[0];
        for (int soNguyen : mang) {
            if (soNguyen > giatriMax) {
                giatriMax = soNguyen;
            }
        }
        return giatriMax;
    }
}
