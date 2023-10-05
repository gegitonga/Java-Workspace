package main;

public class House implements Cloneable, Comparable{
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(){
    }

    public House(int id, double Area){
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public java.util.Date getWhenBuilt(){
        return whenBuilt;
    }
    /*
    Overide the protected clone method defined in the
     object class, and strengthen its accessibility
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
    implement the CompareTo method defined in the Comparable
     */
    public int compareTo(Object o){
        if (area > ((House)o).area){
            return 1;
        }else if (area < ((House)o).area){
            return -1;
        }else{
            return 0;
        }
    }
}


