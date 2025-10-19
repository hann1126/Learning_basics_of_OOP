package belajaroop.inheritance;

public class Elang extends Burung {

    public Elang(String nama) {
        super(nama);
    
    }

    public void berburu() {
        System.out.println(nama+ " menyambar mangsanya!");
    }
    
}
