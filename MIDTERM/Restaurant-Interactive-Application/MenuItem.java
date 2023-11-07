abstract class MenuItem{
    protected String itemName;
    protected double itemPrice;
    
    public String getItemName(){
        return itemName;
    }
    
    public double getItemPrice(){
        return itemPrice;
    }

    public String toString(){
        return "        [" + itemName + "]" + " - Php " + itemPrice;
    }
}