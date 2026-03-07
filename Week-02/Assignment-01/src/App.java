public class App {
    public static void main(String[] args) throws Exception {
        // POLYMORPHISM
        // Polymorphism adalah konsep dalam pemrograman yang memungkinkan objek
        // dari class yang berbeda untuk diperlakukan sebagai objek dari class yang sama.
        // Dalam contoh ini, we can use the reference from the FireArms class.
        FireArms myCarbine = new Carbine("Daniel Defense", "M4A1 SOPMOD Block II");
        FireArms myLMG = new LMG("FN Herstal", "M249 SAW");
        FireArms mySniper = new SniperRifle("Barrett Firearms Manufacturing", "M82A1");
        FireArms myShotgun = new Shotgun("Maxwell Atchison", "AA-12");

        System.out.println("");
        
        // Kita dapat memanggil method startFire() dan reload()
        // pada objek myCarbine dan myLMG, meskipun mereka adalah objek dari class yang berbeda.
        // Ini menunjukkan bahwa kita dapat menggunakan objek dari class yang berbeda
        // dengan cara yang sama, karena mereka mewarisi method yang sama dari class FireArms.
        myCarbine.startFire();
        myCarbine.reload();
        
        System.out.println("");
        
        myLMG.startFire();
        myLMG.reload();

        System.out.println("");

        mySniper.startFire();
        mySniper.reload();

        System.out.println("");

        myShotgun.startFire();
        myShotgun.reload();

        System.out.println("");
    }
}