public abstract class GameItem {
    private String itemName;
    private int price;

    public GameItem(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    // Encapsulation: Akses data melalui Getter
    public String getItemName() { return itemName; }
    public int getPrice() { return price; }

    // Abstraction: Definisi fungsi tanpa implementasi detail
    public abstract void useItem();
}