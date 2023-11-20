package method;

public class LearnMethod {
    //khối được thực thi trước hàm main
    static {
        System.out.println("khối static: hello");
    }
    //<modifier> void menthodName (Danh sách các tham số) {}
    public void showInfo(){
        System.out.println("Automation");
        System.out.println("Selenium");
    }
    private static String getname(){
        String name = "TienNT";
        return name;
    }
    //tham số của method
    protected void displayInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    //giá trị trả về của method
    public int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        LearnMethod pt = new LearnMethod();
        pt.showInfo(); // thông qua class
        getname(); //phải có static

        pt.displayInfo("Tien",18);
        pt.displayInfo("AB", 20);

        System.out.println(Student.college);
//        Student.show();
    }

}
