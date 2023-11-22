package BT_Array;

public class Bai4 {
    //4. Kiểm tra một số có tồn tại trong mảng cho trước hay không
    public static void main(String[] args) {
        int[] mangSoNguyen = {1, 5, 9, 35, 60};

        int soCanKiemTra = 35;

        if (checkIsDisPlay(mangSoNguyen, soCanKiemTra)){
            System.out.println(soCanKiemTra + " - tồn tại trong mảng");
        } else {
            System.out.println(soCanKiemTra + " - không tồn tại trong mảng");
        }
    }

    public static boolean checkIsDisPlay(int[] mang, int soCanKiemTra){
        for (int soNguyen : mang){
            if (soNguyen == soCanKiemTra){
                return true;
            }
        }
        return false;
    }
}
