public class MyOrders implements ConvertToDollar{
    private OrderedItem[] orderedItems;
    private int orderedItemCount;

    public MyOrders(){
        orderedItems = new OrderedItem[50];
        orderedItemCount = 0;
    }

    public void addToOrder(OrderedItem orderedItem){
        orderedItems[orderedItemCount] = orderedItem;
        orderedItemCount++;
    }

    public void showMyOrders(){
        System.out.println("\n-----YOUR ORDERS-----");
        for(int i = 0; i < orderedItemCount; i++){
            System.out.println(orderedItems[i]);
        }
        System.out.printf("\n%s %.2f\n", "Total cost: Php", calculateTotal());
    }

    public void checkOut(){
        System.out.println("\nThank you for ordering!!");
        showMyOrders();
        System.out.printf("%s %.2f\n", "Total cost in Dollars: $", pesoToDollar());
    }
    
    @Override
    public double pesoToDollar() {
        return calculateTotal() / dollarValue;
    }    

    public double calculateTotal(){
        double total = 0.0;
        for(int i = 0; i < orderedItemCount; i++){
            total += orderedItems[i].calculateTotal();
        }
        return total;
    }

    public void clearOrders(){
        this.orderedItems = new OrderedItem[50];
        this.orderedItemCount = 0;
    }
}
