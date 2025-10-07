public class Main {
    public static void main(String[] args) {
        SmartDevice[] perangkat = new SmartDevice[3];
        perangkat[0] = new Lampu("Lampu Ruang Tamu");
        perangkat[1] = new AC("AC Kamar Tidur");
        perangkat[2] = new CCTV("CCTV Garasi");

        System.out.println("========= SISTEM RUMAH PINTAR SMARTIFY =========");

        perangkat[0].hidupkan();
        perangkat[0].tampilkanStatus();
        if (perangkat[0] instanceof Kontrol) {
            ((Kontrol) perangkat[0]).aktifkanOtomatis();
        }
        System.out.println("================================================");

        perangkat[1].hidupkan();
        perangkat[1].tampilkanStatus();
        if (perangkat[1] instanceof Kontrol) {
            ((Kontrol) perangkat[1]).aktifkanOtomatis();
        }
        System.out.println("================================================");

        perangkat[2].hidupkan();
        perangkat[2].tampilkanStatus();
        if (perangkat[2] instanceof Kontrol) {
            ((Kontrol) perangkat[2]).aktifkanOtomatis();
        }
        System.out.println("================================================");


        System.out.println("\n=============== FITUR KHUSUS ================");
        ((Lampu) perangkat[0]).aturKecerahan(80);
        ((AC) perangkat[1]).aturSuhu(22);
        ((CCTV) perangkat[2]).mulaiRekam();
    }
}
