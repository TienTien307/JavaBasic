package SwitchCase;

public class LearnSwitchCase {
    public static void main(String[] args) {
        int num = 10;
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("not 1,5,10");
        }

        //no break
        int num2 = 1;
        switch (num2) {
            case 1:
                System.out.println("1");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("not 1,5,10");
        }
    }
}
