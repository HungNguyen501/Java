package Java.hello_world;

public class NhanVien {
    private int heSoLuong;
    private String name;
    
    public NhanVien(String name) {
        this.name = name;
        heSoLuong = 100;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHeSoLuong() {
        return heSoLuong;
    }
    
    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public void showDetails() {
        System.out.println("Ten nv: " + name + ", he so luong: " + heSoLuong);
    }
    
}