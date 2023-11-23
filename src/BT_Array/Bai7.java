package BT_Array;

public class Bai7 {
    //7. Viết chương trình để tìm tất cả các cặp số trong một mảng số nguyên có tổng bằng một số cho trước.
    public static void main(String[] args) {
        int mangSoNguyen[] = {4, 2, 3, 4, 5, 6};
        timCapSo(mangSoNguyen, 8);
    }

    public static void timCapSo(int mang[], int tongCanTim) {
        for (int i = 0; i < mang.length; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] + mang[j] == tongCanTim) {
                    System.out.println("Tong cua " + mang[i] + " và " + mang[j] + " la: " + tongCanTim);
                }
            }
        }
    }

}
