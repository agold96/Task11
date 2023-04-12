import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyOrderView extends OrderView{

    public MyOrderView() {
        InitializeComponents();
    }

    @Override
    public void InitializeComponents() {
        OrderController controller = new OrderController(this, new OrderModel());
        AddController(controller);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(400,800));
        setBackground(new Color(75,150,222));
        orderText = new JTextArea();
        OrderTotal = new JLabel();
        add(orderText);
        add(OrderTotal);
        JButton hamburger = new JButton("Hamburger");
        hamburger.setPreferredSize(new Dimension(50,60));
        JButton ChickenSandwich = new JButton("Chicken Sandwich");
        ChickenSandwich.setPreferredSize(new Dimension(50,60));
        JButton Fries = new JButton("Fries");
        Fries.setPreferredSize(new Dimension(50,60));
        JButton Pop = new JButton("Pop");
        Pop.setPreferredSize(new Dimension(50,60));
        JButton c1= new JButton("Combo 1");
        c1.setPreferredSize(new Dimension(50,60));
        JButton c2 = new JButton("Combo 2");
        c2.setPreferredSize(new Dimension(50,60));
        JButton clear = new JButton("Clear");
        clear.setPreferredSize(new Dimension(50,60));

        add(hamburger);
        add(ChickenSandwich);
        add(Fries);
        add(Pop);
        add(c1);
        add(c2);
        add(clear);

        hamburger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oc.additem(new Product("Hamburger",5));
                setItems(controller.om.getItemName());
                setTotal(controller.om.getPrice());
            }
        });
        ChickenSandwich.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oc.additem(new Product("Chicken Sandwich",5));
                setItems(controller.om.getItemName());
                setTotal(controller.om.getPrice());
            }
        });
        Fries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oc.additem(new Product("Fries",2.5));
                setItems(controller.om.getItemName());
                setTotal(controller.om.getPrice());
            }
        });
        Pop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oc.additem(new Product("Pop",2.5));
                setItems(controller.om.getItemName());
                setTotal(controller.om.getPrice());
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.om.Clear();
            }
        });

        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Combo c = new Combo();
                c.Additem(new Product("Hamburger",5));
                c.Additem(new Product("Pop",2.5));
                c.Additem(new Product("Fries",2.5));
                oc.additem(c);
                setItems(controller.om.getItemName());
                setTotal(controller.om.getPrice());
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Combo c = new Combo();
                c.Additem(new Product("Chicken Sandwich",5));
                c.Additem(new Product("Pop",2.5));
                c.Additem(new Product("Fries",2.5));
                oc.additem(c);
                setItems(controller.om.getItemName());
                setTotal(controller.om.getPrice());
            }
        });


    }

    public static void main(String[] args) {
        MyOrderView mov = new MyOrderView();
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mov);
        frame.pack();
        frame.setVisible(true);
    }
}
