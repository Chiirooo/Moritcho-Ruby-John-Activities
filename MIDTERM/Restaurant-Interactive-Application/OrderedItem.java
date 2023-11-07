public class OrderedItem {
    private MenuItem orderedItem;
    private int quantity;

    public OrderedItem(MenuItem orderedItem, int quantity){
        this.orderedItem = orderedItem;
        this.quantity = quantity;
    }

    public double calculateTotal(){
        return orderedItem.getItemPrice() * quantity;
    }

    public String toString(){
        return String.format("%dx %s Php %.2f", quantity, orderedItem.getItemName(), calculateTotal());
    }
}
