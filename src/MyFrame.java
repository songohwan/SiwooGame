import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    public MyFrame(){

        ImageIcon logo = new ImageIcon("./images/breadicon.jpg");
        this.setLayout(null); // Disable the default layout manager

        this.setVisible(true);
        this.setTitle("Siwoo Game");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(new FlowLayout());

        if (logo.getImage() == null) {
            System.out.println("Failed to load image");
        }

        this.setIconImage(logo.getImage());

        JButton btn = new JButton("Button testing");
        btn.setBounds(100, 100, 200, 50); // x, y, width, height
        this.add(btn);
        JLabel label = new JLabel("dahdah");
        label.setBounds(150, 200, 100, 30); // x, y, width, height
        this.add(label);


        JLabel iconlabel = new JLabel();

        int newWidth = logo.getIconWidth() / 2;
        int newHeight = logo.getIconHeight() / 2;


        iconlabel.setIcon(logo);

        iconlabel.setBounds(150, 300, logo.getIconWidth(), logo.getIconHeight() ); // x, y, width, height
        this.add(iconlabel);
        this.setVisible(true);
    }

}