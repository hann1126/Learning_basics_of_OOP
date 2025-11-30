package belajaroop;

public class Mobil {
    
    String warna;
    int kecepatan;

    Mobil(String warna, int kecepatan){
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void maju(){
        System.out.println("mobil "+warna + " bergrak maju");
    }
    
    public static void main(String[] args) {
        Mobil m = new Mobil("merah",60);
        m.maju();
    }
}
