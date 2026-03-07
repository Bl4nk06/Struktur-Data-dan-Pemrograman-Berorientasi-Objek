// ABSTRAKSI
// Abstraksi adalah konsep dalam pemrograman yang memungkinkan kita untuk menyembunyikan
// detail implementasi dan hanya menampilkan fitur atau fungsi yang penting bagi pengguna.
// Dengan menggunakan abstraksi, kita dapat fokus pada apa yang dilakukan suatu objek,
// tanpa harus memikirkan bagaimana cara kerjanya secara internal.

public abstract class FireArms {
    private String brand;
    private String series;

    public FireArms(String brand, String series) {
        this.brand = brand;
        this.series = series;
    }

    // ENCAPSULATION
    // Encapsulation adalah konsep dalam pemrograman yang memungkinkan kita
    // untuk menyembunyikan data dan hanya memberikan akses melalui
    // method tertentu, yaitu getter dan setter.
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }

    // METHODE ABSTRAK
    // Disini, startFire() dan reload() adalah method abstrak yang tidak memiliki implementasi.
    // Method ini harus diimplementasikan oleh class yang mewarisi class FireArms.
    public abstract void startFire();
    public abstract void reload();
}