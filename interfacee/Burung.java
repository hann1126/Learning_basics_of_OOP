package belajaroop.interfacee;

public class Burung implements Hewan {

    @Override
    public void suara() {
        System.out.println("Cuittttt");
    }

    @Override
    public void bergerak() {
        System.out.println(" Burung sedang terbang di udara");
    }
    
}
