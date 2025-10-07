public class CCTV extends SmartDevice implements Kontrol {
    private boolean modeRekam;

    public CCTV(String namaPerangkat) {
        super(namaPerangkat);
        this.modeRekam = false;
    }

    public void mulaiRekam() {
        if (status) {
            modeRekam = true;
            System.out.println(namaPerangkat + " mulai merekam.");
        } else {
            System.out.println("CCTV harus dinyalakan sebelum merekam.");
        }
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("CCTV: " + namaPerangkat + " | Status: " + (status ? "ON" : "OFF") + " | Rekam: " + (modeRekam ? "AKTIF" : "NONAKTIF"));
    }

    @Override
    public void aktifkanOtomatis() {
        System.out.println("CCTV otomatis menyala saat mendeteksi gerakan.");
    }

    @Override
    public void nonaktifkanOtomatis() {
        System.out.println("Fitur deteksi gerakan dimatikan.");
    }
}
