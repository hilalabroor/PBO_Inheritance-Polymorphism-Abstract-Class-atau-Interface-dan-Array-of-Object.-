public abstract class SmartDevice {
    String namaPerangkat;
    boolean status;

    public SmartDevice(String namaPerangkat) {
        this.namaPerangkat = namaPerangkat;
        this.status = false;
    }

    public void hidupkan() {
        status = true;
        System.out.println(namaPerangkat + " dinyalakan.");
    }

    public void matikan() {
        status = false;
        System.out.println(namaPerangkat + " dimatikan.");
    }

    public abstract void tampilkanStatus();
}
