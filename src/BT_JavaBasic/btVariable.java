package BT_JavaBasic;

public class btVariable {
    String name = "Bien toan cuc"; // bien toan cuc

    static String sss = "Bien static";  //bien static

    public void sayhello(){
        int n = 10;  //bien local
        System.out.println("Bien local: " +n);
        System.out.println(name);
    }

    public static void main(String[] args) {
        btVariable bien = new btVariable();
        bien.sayhello();

        System.out.println(sss);
    }
}

