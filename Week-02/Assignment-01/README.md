## 4 Pillars of OOP
Di programming berorientasi objek (OOP), terdapat empat pilar utama yang menjadi dasar dalam pengembangan perangkat lunak:

### 1. Encapsulation (Enkapsulasi)
Enkapsulasi adalah konsep menyembunyikan detail implementasi suatu objek dan hanya menyediakan antarmuka yang diperlukan untuk berinteraksi dengan objek tersebut. Ini membantu menjaga integritas data dan mencegah akses langsung ke atribut atau metode yang tidak diinginkan.

### 2. Inheritance (Pewarisan)
Pewarisan memungkinkan sebuah kelas untuk mewarisi sifat dan perilaku dari kelas lain. Kelas yang mewarisi disebut subclass atau child class, sedangkan kelas yang diwarisi disebut superclass atau parent class. Ini mempromosikan penggunaan kembali kode dan memudahkan pemeliharaan.

### 3. Polymorphism (Polimorfisme)
Polimorfisme adalah kemampuan suatu objek untuk mengambil banyak bentuk. Dalam OOP, ini berarti bahwa objek dari kelas yang berbeda dapat diperlakukan sebagai objek dari kelas yang sama melalui pewarisan. Polimorfisme memungkinkan metode yang sama untuk berperilaku berbeda pada kelas yang berbeda.

### 4. Abstraction (Abstraksi)
Abstraksi adalah konsep menyembunyikan detail kompleks dan hanya menampilkan fitur penting dari suatu objek. Ini membantu dalam mengurangi kompleksitas dan meningkatkan efisiensi dengan fokus pada apa yang dilakukan objek daripada bagaimana cara kerjanya. Abstraksi sering dicapai melalui penggunaan kelas abstrak atau antarmuka.

```Java
// Abstract class
abstract class FireArms {
  // Abstract method (does not have a body)
  public abstract void startFire();
  public abstract void reload();
}

// Subclass (inherit from FireArms)
class Carbine extends FireArms {

  // Implementasi metode abstrak
  public void startFire() {
    System.out.println("[STARTS FIRING] Shots fire for " + getBrand() + " " + getSeries());
  }

  public void reload() {
    System.out.println("[RELOAD] Magazine replaced for " + getBrand() + " " + getSeries());
  }
}