public class Equipment extends GameItem {
    private int defenseStat;

    public Equipment(String name, int price, int def) {
        super(name, price);
        this.defenseStat = def;
    }

    @Override
    public void useItem() {
        System.out.println("[EQUIP] Memasang " + getItemName() + ". Defense naik +" + defenseStat);
    }
}