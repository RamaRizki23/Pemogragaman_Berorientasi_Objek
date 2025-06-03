package Pertemuan14.Tugas5;

// TestMahasiswa.java
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("123", "Ali");
        Mahasiswa m2 = new Mahasiswa("124", "Budi");

        m1.displayInfo();
        m2.displayInfo();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
