package belajaroop;

public class Mahasiswa {
    
    String nama;
    String nim;
    double ipk1;
    double ipk2;
    int semester;

    public Mahasiswa(String nama, String nim, double ipk1, double ipk2, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.ipk1 = ipk1;
        this.ipk2 = ipk2;
        this.semester = semester;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("IPK: "+ ipk2);
        System.out.println("Semester: "+ semester);
    }

    public void updateIPK() {
        if (ipk1 < ipk2) {
            System.out.println("IPK naik dari " + ipk1 + " menjadi "+ ipk2); 
        }
        else if (ipk1 > ipk2) {
            System.out.println("IPK turun dari " + ipk1 + " menjadi "+ ipk2);
        }
        else{
            System.out.println("IPK tetap sama yaitu "+ ipk2);
        }
    }

    public void naikSemester() {
        semester++;
        System.out.println("Mahasiswa naik ke semester " + semester);
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Asep", "25123", 3.2, 3.3,3);
        Mahasiswa mhs2 = new Mahasiswa("Budi", "25124", 3.2, 3.1,2);
        mhs1.tampilkanInfo();
        mhs1.updateIPK();
        mhs1.naikSemester();

        System.out.println("===============");

        mhs2.tampilkanInfo();
        mhs2.updateIPK();
        mhs2.naikSemester();
    }


}
