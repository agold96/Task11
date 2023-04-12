public class OrderController {
    public OrderView ov;
    public OrderModel om;

    public OrderController(OrderView ov, OrderModel om) {
        this.ov = ov;
        this.om = om;
    }

    public void additem(OrderItem o){
        om.Additem(o);
    }
    public void Clear(){
        om.Clear();
    }
}
