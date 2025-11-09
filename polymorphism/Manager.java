package belajaroop.polymorphism;

public class Manager extends Karyawan {
    int bonus;

    public Manager(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;

    }

    @Override
    public void info(){
        System.out.println(nama+ " dengan gaji "+ gaji+" dan bonus "+bonus);
    }

}
