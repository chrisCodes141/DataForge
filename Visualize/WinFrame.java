package Visualize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinFrame implements ActionListener {

    private JFrame frame;
    private JPanel panel, panel2, panel3, panel4, panel5, panel6;
    private JLabel label;
    private JButton button;

    private static int clickCount = 0;


    public WinFrame(){
        frame = new JFrame("Naming name name");
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();

        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.RED);
        panel5.setBackground(Color.GREEN);
        panel6.setBackground(Color.YELLOW);
        button = new JButton("next");
        button.addActionListener(this);
        label = new JLabel("No clicks yet");


        //Border from frame
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        panel.setLayout(new GridLayout(3,3));
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);

        panel.add(button);
        panel.add(label);

        //ADDING to FRAME
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(1000, 1000);
        //panel.setBackground(Color.black);
        //packs content
//        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setContentPane(panel); //Set the content pane
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

//    public class Graphics extends java.awt.Graphics(Graphics g){
//        super.Graphics(g);
//    }


    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        label.setText("Number of clicks: "+ clickCount);
    }
}
