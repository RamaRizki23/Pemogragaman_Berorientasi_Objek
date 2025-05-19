package pertemuan11.Latihan1;

public class Main {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(7);
        Bentuk b2 = new Tabung(7, 10);

        b1.tampilkanNama();
        System.out.println("Luas: " + b1.luas());

        b2.tampilkanNama();
        System.out.println("Luas: " + b2.luas());
    }
}

