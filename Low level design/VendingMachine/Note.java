public enum Note {
    FIFTY(50),
    ONE_HUNDRED(100),
    FIVE_HUNDERED(500),
    ONE_THOUSAND(1000);

    public double value;

    Note(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
