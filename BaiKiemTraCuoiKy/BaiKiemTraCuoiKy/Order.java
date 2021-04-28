package BaiKiemTraCuoiKy.BaiKiemTraCuoiKy;

import java.util.List;

class Order{
    private List<Product> itemsOrderd;
    
    public Order(List<Product> io) {
        this.itemsOrderd = io;
    }
    
    public int getSizeOrder() {
        return itemsOrderd.size();
    }
    
    public int countCDItems() {
        int count = 0;
        for (int i = 0; i < itemsOrderd.size(); i++) {
            if (itemsOrderd.get(i) instanceof CD)
                count++;
        }
        
        return count;
    }
    
    public double totalCost() {
        double t = 0.0;
        for (int i = 0; i < itemsOrderd.size(); i++) {
            t += itemsOrderd.get(i).getCost();
        }
        
        return t;
    }
    
}