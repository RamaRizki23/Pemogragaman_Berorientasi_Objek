package pertemuan11.Latihan1;

abstract class Bentuk {
    String nama;

    // Constructor
    Bentuk(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    abstract double luas();

    // Method umum
    void tampilkanNama() {
        System.out.println("Nama bentuk: " + nama);
    }
}

