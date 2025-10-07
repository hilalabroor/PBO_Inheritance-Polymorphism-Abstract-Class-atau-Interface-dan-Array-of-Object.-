public class Lampu extends SmartDevice implements Kontrol {
    private int tingkatKecerahan;

    public Lampu(String namaPerangkat) {
        super(namaPerangkat);
        this.tingkatKecerahan = 50;
    }

    public void aturKecerahan(int tingkat) {
        this.tingkatKecerahan = tingkat;
        System.out.println("Kecerahan " + namaPerangkat + " diatur ke " + tingkat + "%");
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("Lampu: " + namaPerangkat + " | Status: " + (status ? "ON" : "OFF") + " | Kecerahan: " + tingkatKecerahan + "%");
    }

    @Override
    public void aktifkanOtomatis() {
        System.out.println("Lampu otomatis akan menyala saat malam hari.");
    }

    @Override
    public void nonaktifkanOtomatis() {
        System.out.println("Fitur lampu otomatis dimatikan.");
    }
}
