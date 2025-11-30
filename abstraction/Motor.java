package belajaroop.abstraction;

public class Motor extends Kendaraan {
    public Motor(String merk){
        super(merk);
    }

    @Override
    public void jalan(){
        System.out.println(merk+ " Sedang melaju di jalan raya");
    }
}
