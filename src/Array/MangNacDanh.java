package Array;

public class MangNacDanh {

    static void min (int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]){
                min = arr[i];
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
//        //khai báo mảng nặc danh - ko đầy đủ thông tin mảng(độ dài cụ th, không cần nạp theo vị trí cụ thể,..)
//        String menu[] = {"Home", "Emp", "Core", "Project"};
//        //duyệt mảng
//        for (String name : menu){
//            System.out.println(name);
//        }

        int a[] = {0,55,1,6};
        min(a);
    }
}
