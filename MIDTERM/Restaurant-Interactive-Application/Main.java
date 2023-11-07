import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static Menu menu = new Menu(DefaultMenu.mainDishes, DefaultMenu.addOns);
    public static void main(String[] args){
        MyOrders myOrders = new MyOrders();
        mainMenu(myOrders);
    }

    static void mainMenu(MyOrders myOrders){
        char option;
        do{
            System.out.println("\n-----Restaurant Interactive Application-----");
            System.out.println("1) Order Food");
            System.out.println("2) View Orders");
            System.out.println("3) Check out (converted to dollars)");
            System.out.println("X) Exit");
    
            System.out.print("\noption: ");
            option = scan.next().charAt(0);
            scan.nextLine();
    
            switch(option){
                case '1':
                    order(myOrders);
                    break;
                case '2':
                    myOrders.showMyOrders();
                    break;
                case '3':
                    myOrders.checkOut();
                    break;
                case 'x':
                    System.out.println("Come again..");
                    break;
                default: 
                    break;
            }
        }
        while(option != 'x');
    }

    static void order(MyOrders myOrders){
        menu.view();
        MenuItem menuChoice = null;
        System.out.println("\nUse the Product Code");
        do{
            System.out.print("\nEnter your order: ");
            String choice = scan.nextLine().toUpperCase();
    
            menuChoice = menu.getMenuItem(choice);

            if(menuChoice == null){
                System.out.println("invalid choice");
            }
            else{
                System.out.print("Enter quantity: ");
                int quantity = scan.nextInt();
                myOrders.addToOrder(new OrderedItem(menuChoice, quantity));
            }
        }
        while(menuChoice == null);
    }

}
