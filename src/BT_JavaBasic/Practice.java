package BT_JavaBasic;


import java.util.ArrayList;
import java.util.List;

public class Practice {

    //----------BT1
//    String name = "TienNT";  //biến íntance
//    public static int num = 10;  // biến static
//
//    public void sayHello(){
//        int age = 20; //biến local
//        System.out.println(name);
//        System.out.println(age);
//    }
//}
//class B{
//    public static void main(String[] args) {
//        int num2 =  Practice.num + 2;  //gọi biến ở class khác
//        System.out.println(num2);
//
//        Practice bien = new Practice();
//        bien.sayHello();
//    }

    //-------BT2
//    public static int Tong(int c, int d){
//        return c + d;
//    }
//    public static double Tich(double a, double b){
//        return a * b;
//    }
//
//    public static void main(String[] args) {
//        int x = Tong(1,9);
//        double y = Tich(1.5, 1.2);
//        System.out.println("Tổng 2 số nguyên = " +x);
//        System.out.println("Tich 2 số thực = " +y);
//    }

    //----------BT3
//    public static void check(int n){
//        if ( n == 0){
//            System.out.println("n = 0");
//        } else if ( n > 0){
//            System.out.println(" n > 0");
//        } else {
//            System.out.println(" n < 0");
//        }
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        check(n);
//    }


    //-------------BT4
//    public static void main(String[] args) {
//        int[] soChan = new int[26];
//        int index = 0;
//
//        for (int i = 0; i<= 50; i++){
//            if (i % 2 == 0){
//                soChan[index] = i;
//                index++;
//            }
//        }
//        for (int num : soChan){
//            System.out.println(num);
//        }
//    }

    //-------BT5
    public static void main(String[] args) {
        List<Integer> soChan = new ArrayList<>();
        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                soChan.add(i);
            }
        }

        //Chuyển Arraylist sang mảng Array
        //Object[] arr = soChan.toArray();
        for (int num : soChan){
            System.out.println(num);
        }
    }
}