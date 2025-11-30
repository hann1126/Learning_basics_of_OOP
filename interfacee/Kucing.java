package belajaroop.interfacee;

public class Kucing implements Hewan {

    @Override
    public void suara() {
    System.out.println("miawwwwwwww");
    }

    @Override
    public void bergerak() {
     System.out.println("Kucing sedang berjalan di pagar");
    }
    
}
