package pertemuan11.Latihan1;

class Lingkaran extends Bentuk {
    double jariJari;

    Lingkaran(double jariJari) {
        super("Lingkaran"); // Memanggil konstruktor superclass
        this.jariJari = jariJari;
    }

    @Override
    double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
