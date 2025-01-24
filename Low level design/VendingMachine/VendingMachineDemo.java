public class VendingMachineDemo {
    public static void run(){
        VendingMachine vendingMachine = VendingMachine.getInstance();

        //Add products to the Inventory
        Product coke = new Product(10, "Coke");
        Product pepsi = new Product(20, "Pepsi");
        Product water = new Product(30, "water");

        vendingMachine.inventory.addProduct(coke, 5);
        vendingMachine.inventory.addProduct(pepsi, 3);
        vendingMachine.inventory.addProduct(water, 2);

    }
}
