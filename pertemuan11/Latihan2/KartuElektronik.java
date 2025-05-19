package pertemuan11.Latihan2;

class KartuElektronik implements Kartu {
    String pemilik;

    KartuElektronik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Override
    public void otentikasi() {
        System.out.println("Otentikasi untuk " + pemilik + " berhasil.");
    }

    @Override
    public void encode() {
        System.out.println("Data untuk " + pemilik + " telah dienkripsi.");
    }
}

