package pertemuan11.Tugas;

// Subclass mobil listrik
class MobilListrik extends Kendaraan implements KendaraanListrik {
    MobilListrik(String nama) {
        super(nama);
    }

    @Override
    void nyalakan() {
        System.out.println(nama + " dinyalakan secara elektrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang mengisi daya baterai.");
    }
}
