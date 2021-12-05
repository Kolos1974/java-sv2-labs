package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive: " + name + ", " +
                capacity + " GB, " +
                price +" Ft";
    }

    public void risePrice(int percent) {
        price = (int) (price * (1+(percent/100.0)));

        // Other count:
        // this.price =  (int) (this.price + (this.price * (percent /100.0)));

        // Official:
        //this.price += this.price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other){
        if ((price*1.0/capacity)>(other.getPrice()*1.0/other.getCapacity())){
            return 1;
        }
        if ((price*1.0/capacity)<(other.getPrice()*1.0/other.getCapacity())){
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        if (this.price<other.getPrice()){
            return true;
        }
        return false;
    }

}
