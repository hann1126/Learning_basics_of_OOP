package belajaroop.inheritance;

public class Kucing extends Mamalia{

     public Kucing(String nama, int jumlahKaki){
        super(nama, jumlahKaki);
    }

    public void meong() {
        System.out.println(nama+ " mengeong: Meooong...");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan dengan empat kali");
    }
}
