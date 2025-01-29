public class VendingMachine {

    private static VendingMachine instance;
    Inventory inventory;
    private VendingMachineState readyState;
    private VendingMachineState dispenseState;
    private VendingMachineState idlState;
    private VendingMachineState returnChangeState;
    private VendingMachineState currentState;
    private Product selectedProduct;
    private double totalPayment;

     

    private VendingMachine(){
        readyState = new ReadyState(this);
        idlState = new IdleState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idlState;
        selectedProduct = null;
        totalPayment = 0.0;

    }

    public static synchronized VendingMachine getInstance(){
        if(instance == null){
            instance = new VendingMachine();
        }
        return instance;
    }

    public void selectedProduct(Product product){
        currentState.selectProduct(product);
    }
    public void insertCoin(Coin coin) {
        currentState.insertCoin(coin);
    }

    public void insertNote(Note note) {
        currentState.insertNote(note);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public void returnChange() {
        currentState.returnChange();
    }

    void addCoin(Coin coin){
        totalPayment += coin.getValue();
    }

    void addNote(Note note){
        totalPayment += note.getValue();
    }

    VendingMachineState getReadyState(){
        return readyState;
    }

    VendingMachineState getDispenseState(){
        return dispenseState;
    }

    VendingMachineState getReturnChangeState(){
        return returnChangeState;
    }

    VendingMachineState getIdlState(){
        return idlState;
    }

    double getTotalPayment(){
        return totalPayment;
    }

    void resetPayment(){
        totalPayment = 0.0;
    }

    void resetSelectedProduct(){
        selectedProduct = null;
    }
    
    void setState(VendingMachineState state){
        currentState = state;
    }

    Product getSelectedProduct(){
        return selectedProduct;
    }

    void setSelectedProduct(Product product){
        selectedProduct =product;
    }

}
