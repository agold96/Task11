import java.util.ArrayList;

public class Combo implements OrderItem{

    public ArrayList<OrderItem> items = new ArrayList<OrderItem>();

    public void Additem(OrderItem oi){
            items.add(oi);
    }

    @Override
    public String getItemName() {
        String msg = "";
        for (OrderItem oi : items) {
            msg += '\t' + oi.getItemName() + "\n";
        }
        return msg;
    }

    @Override
    public double getPrice() {
        double totalPrice =0;
        for(OrderItem oi: items){
            totalPrice+= oi.getPrice();
        }
        return totalPrice *.9;
    }

    @Override
    public String toString() {
        String msg = getItemName();
        double totalPrice = getPrice();
        return "Combo of:\n" + msg + " costs $"+String.format("%.2f",totalPrice);

    }
}
