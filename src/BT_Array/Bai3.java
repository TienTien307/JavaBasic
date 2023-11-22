package BT_Array;

public class Bai3 {
    //3. Viết một chương trình Lặp số từ 0 đến 50. Lưu những giá trị chẵn vào 1 mảng mới. Sau đó hiển thị mảng mới đó ra

    public static void main(String[] args) {
        int soChan[] = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i += 2) {
            soChan[index] = i;
            index++;
        }

        System.out.println("Mảng số chẵn từ 0 đến 50:");
        for (int so : soChan) {
            System.out.print(so + " ");

        }
    }
}
