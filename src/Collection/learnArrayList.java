package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class learnArrayList {

    // thuộc interface List
    public static void main(String[] args) {
        // khai báo và khởi tạo đối tượng ArrayList
        List<String> listMenu = new ArrayList<String>(); // cách 1
        //ArrayList<String> listMenu = new ArrayList<String()>();  //cách 2

        // thêm phần tử vào bộ ArrayList
        listMenu.add("Home");
        listMenu.add("Client");
        listMenu.add("Project");
        listMenu.add("Task");

        //tính độ dài cửa ArrayList - hàm size
        System.out.println(("Độ dài: ") + listMenu.size());

        //xóa 1 phần tử
        listMenu.remove(0);

        //set giá trị mới cho phần tử ở vị trí thứ 2
        listMenu.set(1, "Automation");

        //tìm kiếm giá trị
        System.out.println(listMenu.contains("Task"));

        //lấy gái trị phần tử - dùng for, foreach, interator
        for (int i = 0; i < listMenu.size(); i++){
            System.out.println(listMenu.get(i));
        }

        for (String obj : listMenu){
            System.out.print(obj + ", ");
        }

        System.out.println("");
        Iterator<String> itr = listMenu.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }

        //copy phần tử của list 1 sang list 2
        //list 1: listmenu
        //list 2: tempMenu
        ArrayList<String> tempMenu = new ArrayList<String>();
        tempMenu.addAll(listMenu);

        System.out.println("");
        System.out.println("--------------");
        for (String obj : tempMenu){
            System.out.print(obj + ", ");
        }
    }
}
