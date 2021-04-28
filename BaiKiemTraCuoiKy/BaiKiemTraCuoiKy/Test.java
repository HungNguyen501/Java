package BaiKiemTraCuoiKy.BaiKiemTraCuoiKy;

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String args[]) {
        List<Product> itemsOrdered = new ArrayList<Product>();
        
        itemsOrdered.add(new Book("sach 1", 1.1, "nam"));
        itemsOrdered.add(new Book("sach 2", 1.1, "toan"));
        itemsOrdered.add(new CD("cd 1", 2.1, "trung"));
        itemsOrdered.add(new CD("cd 2", 2.1, "nhan"));
        
        Order order = new Order(itemsOrdered);
        
        System.out.println("Kich co cua order: " + order.getSizeOrder());
        System.out.println("so luong cd trong order: " + order.countCDItems());
        System.out.println("total cost: " + order.totalCost());
        
    }
}