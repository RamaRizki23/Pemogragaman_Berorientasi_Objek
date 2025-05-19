package pertemuan11.Tugas;

// Kelas abstrak
abstract class Kendaraan {
    String nama;

    Kendaraan(String nama) {
        this.nama = nama;
    }

    abstract void nyalakan();
}
