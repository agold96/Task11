public class Product implements OrderItem{

    public String name;
    public double Price;

    public Product(String name, double price) {
        this.name = name;
        Price = price;
    }

    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return name + " costs: $"+Price;
    }

}
