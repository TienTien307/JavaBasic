package BT_JavaBasic;

public class BTToantuIfElse {
    //    public static void check(int n){
//        if ( n == 0){
//            System.out.println("TH1: n = 0");
//        } else if (n > 0) {
//            System.out.println("TH2: n > 0");
//        } else{
//            System.out.println("TH3: n < 0");
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 0;
//        check(n);
//    }
    public static void check(int n, int a) {
        if (a == n) {
            System.out.println("TH1: a = n");
        } else if (a > n) {
            System.out.println("TH2: a > n");
        } else {
            System.out.println("TH3: a < n");
        }
    }

    public static void main(String[] args) {
        int n = 100;
        int a = 10;
        check(n,a);
    }

}
