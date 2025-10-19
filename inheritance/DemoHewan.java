package belajaroop.inheritance;

public class DemoHewan {
    public static void main(String[] args) {
        Kucing k = new Kucing("Nunuy", 4);
        Anjing a = new Anjing("Boby", 4);
        Elang e = new Elang("Rocky");

        k.info();
        k.bergerak();
        k.makan();
        k.meong();

        System.out.println("=============");

        a.info();
        a.bergerak();
        a.makan();
        a.menggonggong();

        System.out.println("===========");

        e.makan();
        e.bergerak();
        e.terbang();
        e.berburu();
    }
}
