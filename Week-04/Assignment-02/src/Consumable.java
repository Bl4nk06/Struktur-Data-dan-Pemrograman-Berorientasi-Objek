public class Consumable extends GameItem {
    private int healAmount;

    public Consumable(String name, int price, int heal) {
        super(name, price);
        this.healAmount = heal;
    }

    @Override
    public void useItem() {
        System.out.println("[USE] Meminum " + getItemName() + ". HP bertambah +" + healAmount);
    }
}