package BT_JavaBasic;

public class BtMethodDataType {
    static int tong(int a, int b){
        return a + b;
    }
    static double tich(double c, double d){
        return c * d;
    }

    public static void main(String[] args) {
        int x = tong(2,5);
        double y = tich(1.5,2.5);
        System.out.println(x);
        System.out.println(y);
    }
}
