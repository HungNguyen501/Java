package Java.BaiKiemTraCuoiKy.BaiKiemTraCuoiKy;

abstract class Product {
    protected String title;
    protected double cost;
    
    public Product() {
        this.title = "book";
        this.cost = 0.0;
    }
    
    public Product(String t, double c) {
        this.title = t;
        this.cost = c;
    }
    
    public double getCost() {
        return this.cost;
    } 
    
    public void setCost(double c) {
        this.cost = c;
    } 
}