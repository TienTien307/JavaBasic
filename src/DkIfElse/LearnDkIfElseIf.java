package DkIfElse;

public class LearnDkIfElseIf {
    public static void main(String[] args) {
//        int marks = 99;
//
//        if (marks < 50){
//            System.out.println("tạch!");
//        } else if (marks >= 50 && marks < 60) {
//            System.out.println("xếp loại D");
//        } else if (marks >= 60 && marks < 70) {
//            System.out.println("xếp loại C");
//        } else if (marks >= 70 && marks < 80){
//            System.out.println("xếp loại B");
//        } else if (marks >= 80 && marks < 90) {
//            System.out.println("xếp loại A");
//        } else if (marks >= 90 && marks < 100) {
//            System.out.println("xếp loại A+");
//        } else {
//            System.out.println("giá trị ko hợp lệ");
//        }

        //automation
        String msg = "please fill value";
        if (msg == "please fill value"){
            System.out.println("chưa điền email");
        } else if ( msg == "please include @...") {
            System.out.println("format email chưa đúng");
        } else if ( msg == "pls enter a part following @...") {
            System.out.println("format email chưa đúng");
        } else {
            System.out.println("Điền email thành công");
        }
    }
}
