package belajaroop.inheritance;

public class Burung extends Hewan{

    public Burung(String nama) {
        super(nama);

    }

    public void terbang() {
        System.out.println(nama + " sedang terbang tinggi");
    }

    @Override
    public void bergerak(){
        System.out.println(nama + " sedang terbang dengan sayapnya");
    }
    
}
