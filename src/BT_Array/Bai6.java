package BT_Array;

public class Bai6 {
    //6. Viết chương trình kiểm tra xem một mảng số nguyên có được sắp xếp tăng dần không

    public static void main(String[] args) {
        int[] mangSoNguyen1 = {10, 5, 90, 35, 60};
        int[] mangSoNguyen2 = {1, 5, 9, 35, 6};

        if (checkSortASC(mangSoNguyen1)) {
            System.out.println("Mảng 1 được sắp xếp tăng dần.");
        } else {
            System.out.println("Mảng 1 không được sắp xếp tăng dần.");
        }

        if (checkSortASC(mangSoNguyen2)) {
            System.out.println("Mảng 2 được sắp xếp tăng dần.");
        } else {
            System.out.println("Mảng 2 không được sắp xếp tăng dần.");
        }

    }

    public static boolean checkSortASC(int[] mang) {
        for (int i = 0; i < mang.length - 1; i++) {
            if (mang[i] > mang[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
