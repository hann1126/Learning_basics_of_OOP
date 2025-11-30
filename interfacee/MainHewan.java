package belajaroop.interfacee;

public class MainHewan {
    public static void main(String[] args) {
        Hewan[] jenis= {
            new Kucing(),
            new Burung()
        };

        for (Hewan k : jenis){
            k.suara();
            k.bergerak();
        }
    }
}
