// INHERITANCE
// Inheritance adalah konsep dalam pemrograman yang memungkinkan kita
// untuk membuat class baru berdasarkan class yang sudah ada. Class baru ini
// disebut subclass atau child class.

class SniperRifle extends FireArms {
    public SniperRifle(String brand, String series) {
        super(brand, series);
        System.out.println("[UNIT READY] Sniper Rifle " + getBrand() + " " + getSeries());
    }

    // Override method startFire() dan reload()
    // yang didefinisikan di class FireArms.
    @Override
    public void startFire() {
        System.out.println("[BOOM!] Precision shot fired from " + getSeries() + "!");
    }
    @Override
    public void reload() {
        System.out.println("[RELOAD] Loading bolt-action round for " + getSeries());
    }
}