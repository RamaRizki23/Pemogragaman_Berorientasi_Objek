package Pertemuan12.polymorph;

abstract class Bentuk {
    abstract void gambar();
}

class Lingkaran extends Bentuk {
    void gambar() {
        System.out.println("Menggambar Lingkaran");
    }
}

class Tabung extends Bentuk {
    void gambar() {
        System.out.println("Menggambar Tabung");
    }
}