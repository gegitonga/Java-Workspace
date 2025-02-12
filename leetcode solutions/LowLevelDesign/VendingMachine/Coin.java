public enum Coin {
    FIVE(5),
    TEN(10),
    TWENTY(20);

    public double value;
    
    Coin(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
