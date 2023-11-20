package method;

public class Student {
    public int rollno;
    public String name;
    public static String college = "Buu chính viễn thông";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

//    static void show() {
//        System.out.println(rollno + " - " + name + " - " + college);
//    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Thông");
        Student s2 = new Student(222,"Minh");

        s1.display();
        s2.display();
    }
}
