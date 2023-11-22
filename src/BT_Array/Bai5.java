package BT_Array;

public class Bai5 {
    // 5. Viết chương trình để tìm số chẵn đầu tiên trong một mảng số nguyên.
    public static void main(String[] args) {
        int[] mangSoNguyen = {1, 5, 9, 35, 450};

        int soChanDauTien = timSoChan(mangSoNguyen);
        System.out.printf("Số chẵn đầu tiên trong mảng là: " +soChanDauTien);
    }

    public static int timSoChan(int[] mang){
        int soChanDauTien = mang[0];
        for(int soChan : mang ){
            if (soChan % 2 == 0){
                soChanDauTien = soChan;
                return soChanDauTien;
            }
        }
        return soChanDauTien;
    }
}
