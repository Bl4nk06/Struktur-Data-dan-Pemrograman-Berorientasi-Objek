public class InventoryApp {
    public static void main(String[] args) {
        System.out.println("=== LOADING RPG INVENTORY SYSTEM ===\n");

        // Polymorphism: Berbagai subclass disimpan dalam tipe referensi Parent
        GameItem slot1 = new Consumable("High Potion", 150, 500);
        GameItem slot2 = new Equipment("Aegis Shield", 2500, 85);

        slot1.useItem();
        slot2.useItem();

        System.out.println("\n=== SYSTEM READY ===");
    }
}