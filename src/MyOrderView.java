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
        setPreferredSize(new Dimension(900,700));
        setBackground(new Color(75,150,222));
        JPanel buttons= new JPanel();
        buttons.setLayout(new FlowLayout());
        buttons.setPreferredSize(new Dimension(900,150));
        orderText = new JTextArea();
        OrderTotal = new JLabel();
        OrderTotal.setPreferredSize(new Dimension(900,50));
        add(orderText);
        add(OrderTotal);
        JButton hamburger = new JButton("Hamburger");
        hamburger.setPreferredSize(new Dimension(120,100));
        JButton ChickenSandwich = new JButton("Chicken Sandwich");
        ChickenSandwich.setPreferredSize(new Dimension(120,100));
        JButton Fries = new JButton("Fries");
        Fries.setPreferredSize(new Dimension(120,100));
        JButton Pop = new JButton("Pop");
        Pop.setPreferredSize(new Dimension(120,100));
        JButton c1= new JButton("Combo 1");
        c1.setPreferredSize(new Dimension(120,100));
        JButton c2 = new JButton("Combo 2");
        c2.setPreferredSize(new Dimension(120,100));
        JButton clear = new JButton("Clear");
        clear.setPreferredSize(new Dimension(120,100));

        buttons.add(hamburger);
        buttons.add(ChickenSandwich);
        buttons.add(Fries);
        buttons.add(Pop);
        buttons.add(c1);
        buttons.add(c2);
        buttons.add(clear);
        add(buttons);

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
                oc.additem(new Product("Cleared",0));
                setItems(controller.om.getItemName());
                setTotal(controller.om.getPrice()-controller.om.getPrice());
                controller.Clear();

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
