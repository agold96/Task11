import javax.swing.*;
import java.awt.*;
public abstract class OrderView extends JPanel{

    public JTextArea orderText;
    public JLabel OrderTotal;

    public OrderController oc;

    public void AddController(OrderController oc){
        this.oc = oc;
    }
    public abstract void InitializeComponents();

    public void setItems(String s){
        orderText.setText(s);
    }
    public void setTotal(double p){
        OrderTotal.setText(String.valueOf(p));
    }




}
