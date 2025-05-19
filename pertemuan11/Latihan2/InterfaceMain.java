package pertemuan11.Latihan2;

public class InterfaceMain {
    public static void main(String[] args) {
        Kartu kartu = new KartuElektronik("Rama");
        kartu.otentikasi();
        kartu.encode();
    }
}

