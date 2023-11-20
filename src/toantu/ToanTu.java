package toantu;

public class ToanTu {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // toán tử số học
//        System.out.println(a/b);
//        System.out.println(a%b);
//        //System.out.println(a+=2);
//        System.out.println(a%=3);

        //toán tử quan hệ
        System.out.println(a != b);

        //toán tử logic
        System.out.println( a > 20 && ( b < 30));
        System.out.println(!(b<30));

        //toán tử gán
        String name, add, city = "HN";
        name =  add = city;
        System.out.println(name);
    }
}
