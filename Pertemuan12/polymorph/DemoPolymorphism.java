package Pertemuan12.polymorph;

public class DemoPolymorphism {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran();
        Bentuk b2 = new Tabung();

        b1.gambar(); // Output: Menggambar Lingkaran
        b2.gambar(); // Output: Menggambar Tabung
    }
}
