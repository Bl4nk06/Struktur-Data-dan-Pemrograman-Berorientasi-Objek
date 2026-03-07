# Dokumentasi Implementasi OOP: Firearms Project

Dokumen ini menjelaskan implementasi empat pilar OOP menggunakan studi kasus sistem senjata api (*Firearms*).

---

## 1. Abstraksi (Abstraction)
Menyembunyikan detail mekanis yang rumit dan hanya mengekspos fungsi utama seperti menembak.
* **Implementasi:** Menggunakan `abstract class FireArms`.

## 2. Pewarisan (Inheritance)
Memungkinkan kelas spesifik untuk mewarisi atribut dasar dari kelas induk.
* **Implementasi:** `class Carbine extends FireArms`.

## 3. Polimorfisme (Polymorphism)
Kemampuan objek untuk merespons metode yang sama dengan cara yang berbeda.
* **Implementasi:** Metode `startFire()` dapat di-*override* oleh jenis senjata lain (misal: Shotgun atau Sniper) dengan logika suara atau efek yang berbeda.

## 4. Enkapsulasi (Encapsulation)
Menjaga variabel seperti `brand` dan `model` agar tidak diubah sembarangan dari luar kelas.
* **Implementasi:** Biasanya menggunakan akses `private` pada variabel dan menyediakan `public getter/setter`.

---

## Contoh Kode Java

```java
// Pilar: Abstraksi
abstract class FireArms {
    // Definisi umum tanpa detail implementasi
    public abstract void startFire();
}

// Pilar: Inheritance (Pewarisan)
class Carbine extends FireArms {
    private String brand;
    private String model;

    public Carbine(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Pilar: Polimorfisme (Overriding)
    @Override
    public void startFire() {
        System.out.println("[STARTS FIRING] Shots fire for " + brand + " " + model);
    }
}