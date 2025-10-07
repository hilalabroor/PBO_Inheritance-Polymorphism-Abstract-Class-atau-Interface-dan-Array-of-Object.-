public class AC extends SmartDevice implements Kontrol {
    private int suhu;

    public AC(String namaPerangkat) {
        super(namaPerangkat);
        this.suhu = 24;
    }

    public void aturSuhu(int suhu) {
        this.suhu = suhu;
        System.out.println("Suhu " + namaPerangkat + " diatur ke " + suhu + "°C");
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("AC: " + namaPerangkat + " | Status: " + (status ? "ON" : "OFF") + " | Suhu: " + suhu + "°C");
    }

    @Override
    public void aktifkanOtomatis() {
        System.out.println("AC otomatis menyala saat suhu ruangan > 28°C.");
    }

    @Override
    public void nonaktifkanOtomatis() {
        System.out.println("Fitur AC otomatis dimatikan.");
    }
}
