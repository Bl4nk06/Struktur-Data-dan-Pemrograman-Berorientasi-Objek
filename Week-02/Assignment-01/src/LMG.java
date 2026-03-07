// INHERITANCE
// Inheritance adalah konsep dalam pemrograman yang memungkinkan kita
// untuk membuat class baru berdasarkan class yang sudah ada. Class baru ini
// disebut subclass atau child class.

class LMG extends FireArms {
    public LMG(String brand, String series) {
        super(brand, series);
        System.out.println("[UNIT CREATED] LMG " + getBrand() + " " + getSeries());
    }

    // Override method startFire() dan reload()
    // yang didefinisikan di class FireArms.
    @Override
    public void startFire() {
        System.out.println("[RATATATA!] Belt fed " + getSeries() + " suppressing fire initiated!");
    }
    @Override
    public void reload() {
        System.out.println("[RELOAD] Replacing heavy ammo box for " + getSeries());
    }
}