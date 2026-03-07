// INHERITANCE
// Inheritance adalah konsep dalam pemrograman yang memungkinkan kita
// untuk membuat class baru berdasarkan class yang sudah ada. Class baru ini
// disebut subclass atau child class.

class Shotgun extends FireArms {
    public Shotgun(String brand, String series) {
        super(brand, series);
        System.out.println("[UNIT READY] Shotgun " + getBrand() + " " + getSeries());
    }

    // Override method startFire() dan reload()
    // yang didefinisikan di class FireArms.
    @Override
    public void startFire() {
        System.out.println("[CHUCK-POW!] Wide spread shot from " + getSeries() + "!");
    }
    @Override
    public void reload() {
        System.out.println("[RELOAD] Inserting shells into " + getSeries());
    }
}