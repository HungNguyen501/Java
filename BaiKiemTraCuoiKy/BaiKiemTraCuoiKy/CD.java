package Java.BaiKiemTraCuoiKy.BaiKiemTraCuoiKy;

class CD extends Product{
    private String artist;
    
    // Default Constructor
    public CD() {
        
    }
    
    public CD(String artist) {
        this.artist = artist;
    }
    
    public CD(String title, double cost,String artist) {
        super(title, cost);
        this.artist = artist;
    }

    public void printInfo() {
        System.out.println("artits: " + this.artist);
    }
}