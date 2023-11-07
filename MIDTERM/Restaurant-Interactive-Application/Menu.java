public class Menu {
    private MenuItem[] mainDishes;
    private MenuItem[] addOns;

    public Menu(MenuItem[] mainDishes, MenuItem[] addOns){
        this.mainDishes = mainDishes;
        this.addOns = addOns;
    }
    
    public void view(){
        System.out.println("\n----------------Menu:----------------");
        int i = 0;
        for(; i < mainDishes.length; i++){
            System.out.println(mainDishes[i]);
        }
        System.out.println("\n            Add Ons:");
        for(int j = 0; j < addOns.length; j++){
            System.out.println(addOns[j]);
        }
    }

    public MenuItem getMenuItem(String choice){
        for(int i = 0; i < mainDishes.length; i++){
            if(mainDishes[i].getItemName().equals(choice)){
                return mainDishes[i];
            }
        }

        for(int i = 0; i < addOns.length; i++){
            if(addOns[i].getItemName().equals(choice)){
                return addOns[i];
            }
        }
        return null;
    }

}
