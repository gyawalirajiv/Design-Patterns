package eCommerce;

public class Product extends CatelogComponent {

    private final Double price;
    public Product(String name, Double price) {
        super(name);
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Product Name: " + this.getName() + ", " + "Price: " + this.price);
    }
}
