import java.util.ArrayList;

public class OrderModel implements OrderItem{
    public ArrayList<OrderItem> order = new ArrayList<OrderItem>();

    public String msg = "";

    public double totalPrice = 0;

    public void Additem(OrderItem oi) {
        order.add(oi);
    }

    public void Clear(){
        msg = "";
        totalPrice = 0;
        order.clear();
    }

    @Override
    public String getItemName() {
        for (OrderItem oi : order) {
            msg += oi.getItemName() + "\n";
        }
        return msg;
    }

    @Override
    public double getPrice() {
        for(OrderItem oi: order){
            totalPrice+= oi.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String msg = getItemName();
        double totalPrice = getPrice();
        return "Your order:\n" + msg + " costs $"+String.format("%.2f",totalPrice)+'\n';

    }
}
