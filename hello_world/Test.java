package Java.hello_world;

public class Test{  
    public static void main(String[] args){  
        NhanVien [] congTy = {new NhanVien("Hung"), new NhanVien("Hoang")};
        
        congTy[0].showDetails();
        congTy[1].setHeSoLuong(200);
        congTy[0].showDetails();
        congTy[1].showDetails();
    }  
}  