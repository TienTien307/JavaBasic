package Variable;

public class SinhVien {
    //biến static
    public static  String ten = "Nguyen Văn A";
    //biến non-static
    public int age = 10;

    public void getName(){
        //System.out.println(age);
        System.out.println(ten);
    }

    public static void showInfo(){
        //System.out.println(age);
        System.out.println(ten);
    }
    public static void main(String[] args) {
        System.out.println(ten);
        //System.out.println(age);

        SinhVien sv = new SinhVien();
        System.out.println(sv.age);
    }


}
