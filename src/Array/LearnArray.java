package Array;

public class LearnArray {
    public static void main(String[] args) {
        //khai báo và khởi tạo mảng
        int a[] = new int[4];

        //gán giá trị cho phần tử trong mảng
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[3] = 15;

        //duyệt phần tử trong mảng - in mảng ra MH
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i] + "");
//        }

        String menu[] = new String[10];
        //nạp giá trị chuỗi vào mảng
        for (int i = 0; i < menu.length; i++){
            menu[i] = "Home";
        }
        System.out.println(menu[2]);
    }
}
