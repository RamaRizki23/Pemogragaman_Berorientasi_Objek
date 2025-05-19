package pertemuan11.Latihan1;

class Tabung extends Bentuk {
    double jariJari;
    double tinggi;

    Tabung(double jariJari, double tinggi) {
        super("Tabung");
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        // Rumus luas permukaan tabung = 2πr² + 2πrt
        return 2 * Math.PI * jariJari * jariJari + 2 * Math.PI * jariJari * tinggi;
    }
}
