import java.util.ArrayList;

public class OrderModel implements OrderItem{


    ArrayList<OrderItem> order;



    public OrderModel() {
        order = new ArrayList<OrderItem>();
    }

    public void Additem(OrderItem oi) {
        order.add(oi);
    }

    public void Clear(){
        order.clear();
    }

    @Override
    public String getItemName() {
        String msg = "";
        for (OrderItem oi : order) {
            msg += oi.getItemName() + "\n";
        }
        return msg;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for(OrderItem oi: order){
            totalPrice+= oi.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String msg = getItemName();
        double totalPrice = getPrice();
        return "Your order:\n" + msg + "costs $"+String.format("%.2f",totalPrice)+'\n';

    }
}
