package belajaroop.abstraction;

public class Mobil extends Kendaraan {
    public Mobil (String merk){
        super(merk);
    }
    
    @Override
    public void jalan(){
        System.out.println(merk+ " berjalan di jalan raya");
    }
}
