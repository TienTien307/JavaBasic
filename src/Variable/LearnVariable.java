package bien;

public class LearnVariable {

    // hàm xây dựng : trùng tên với class
    public LearnVariable() {

    }
    //block
    static {

    }
    static String city = "HN"; //Biến toàn cục

    public void sayHello(){
        int n = 10;  // Biến local
        System.out.println("Gia trị của n la: " +n);
        System.out.println(city);
    }
    //biến
    public static void main(String[] args) { //hàm or phương thức main
        String name = "TienNT";
        int age = 25;
        String address = "HN";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        System.out.println(city);

        LearnVariable bienLocal = new LearnVariable();
        bienLocal.sayHello();
    }

}
//- Biến local
//        - Khai báo trong các phương thức, hàm contructor hoặc các block
//        - không được sd "access modifier" khi khai báo biến local ( public, private, protected)
//        - các biến local được lưu trên vùng nhớ stack của bộ nhớ
//        - cần khởi tạo giá trị mặc định cho biến local trước
//        - không được gọi sang hàm khác
//
//- Biến toàn cục - instance
//        - Được khai báo trong 1 class, bên ngoài phương thức, contructor, block
//        - được lưu trong bộ nhớ heap
//        - được tạo khi 1 đối tượng được tạo bằng việc sử dụng từ khóa "new" và sẽ bị phá hủy khi đối tượng phá hủy
//        - dùng được ở nhiều hàm khác nhau
//        - dùng được phạm vi truy cập ( public, private, protected)
//        - có thể gọi tên trực tiếp vào các hàm - trừ hàm "main" ( trừ hàm có trạng thái static)
//
// - Biến static
//	      - khai báo trong 1 class với từ khóa static, phía bên ngoài phương thức, contructor và block
//        - chỉ có duy nhất 1 bản sao của các biến static được tạo ra
//        - được truy cập thông qua tên class: tenClass.tenBien
//        - trong class, các phương thức sử dụng biến static bằng cách họi tên của nó khi phương thức đó cùng dược khai báo với từ khóa static
//	      - có thể gọi tên trực tiếp vào các hàm