package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void store(int stock) {
        setStock(getStock()+stock);
    }

    public void dispatch(int stock) {
        setStock(getStock()-stock);
    }

    @Override
    public String toString() {
        return "Store{" +
                "product='" + product + '\'' +
                ", stock=" + stock +
                '}';
    }
}
