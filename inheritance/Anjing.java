package belajaroop.inheritance;

public class Anjing extends Mamalia {
    public Anjing(String nama, int jumlahKaki) {
        super(nama, jumlahKaki);
    
    }

    public void menggonggong() {
        System.out.println(nama+ " menggonggong = Guk Guk ....");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " sedang berlari ");
    }
}
