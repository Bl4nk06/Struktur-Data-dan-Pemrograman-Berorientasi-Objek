// INHERITANCE
// Inheritance adalah konsep dalam pemrograman yang memungkinkan kita
// untuk membuat class baru berdasarkan class yang sudah ada. Class baru ini
// disebut subclass atau child class.

public class Carbine extends FireArms {
    public Carbine(String brand, String series) {
        super(brand, series);
        System.out.println("[UNIT CREATED] Carbine " + getBrand() + " " + getSeries());
    }

    // Override method startFire() dan reload()
    // yang didefinisikan di class FireArms.
    @Override
    public void startFire() {
        System.out.println("[BANG!] Carbine " + getSeries() + " firing in semi-auto mode.");
    }
    @Override
    public void reload() {
        System.out.println("[RELOAD] Swapping magazine for " + getSeries());
    }
}