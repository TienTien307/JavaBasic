package DkIfElse;

public class LearnDkIfElse {
    public static void main(String[] args) {
        int age = 30;
        String name = "Tien";

        if (age > 30) {
            System.out.println("tuổi > 30");
        } else {
            System.out.println("tuối <= 30");
        }

        //kết hợp nhiều đk
        if (age > 30 || name.equals("Tien")) {
            System.out.println("pass");
        } else {
            System.out.println("false");
        }
    }


}
