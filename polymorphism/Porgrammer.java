package belajaroop.polymorphism;

public class Porgrammer extends Karyawan {
    int banusLembur;

    public Porgrammer(String nama, int gaji, int bonusLembur) {
        super(nama, gaji);
        this.banusLembur = bonusLembur;
    }

    @Override
    public void info(){
        System.out.println(nama+" dengan gaji "+gaji+" dan banus lembur "+banusLembur);
    }
    
}