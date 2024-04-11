package item;

public class ItemShelf {
    private int itemCode;
    private Item item;
    private boolean soldOut;
    private int quantity;

    public Item getItem() {
        return this.item;
    }

    public int getItemCode() {
        return this.itemCode;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isSoldOut() {
        return this.soldOut;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
