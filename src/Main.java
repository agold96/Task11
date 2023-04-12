public class Main {
    public static void main(String[] args) {
        Product x = new Product("CheeseBurger",5);
        Product y = new Product("Fries",2.25);
        Product z = new Product("Drink",2.5);
        System.out.println(x.toString());
        Combo c = new Combo();
        c.Additem(x);
        c.Additem(y);
        c.Additem(z);
        System.out.println(c.toString());

        OrderModel m = new OrderModel();
        m.Additem(x);
        m.Additem(y);
        System.out.println(m.toString());
        m.Clear();
        m.Additem(z);
        m.Additem(c);
        m.Additem(x);
        System.out.println(m.toString());
    }
}