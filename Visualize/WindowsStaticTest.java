package Visualize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class createWindows extends JFrame implements ActionListener {

    createWindows(String title, int x, int y){
        super(title);

        JFrame jf = new JFrame();
        jf.setSize(1000,1000);
        JPanel jp = new JPanel();
        JPanel jp2 = new JPanel();
        jp.setSize(200,200);
        jp.setBackground(Color.red);
//        jp2.setBackground(Color.pink);

        jf.add(jp);
        jf.add(jp2);
        jf.setLocationRelativeTo(null);
        jf.setContentPane(jp); //Set the content pane
        jf.setContentPane(jp2); //Set the content pane
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("taking care of abstraction TEMP");
    }
}

public class WindowsStaticTest {
    public static void main(String[] args) {

        // to run as a thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final createWindows wnd = new createWindows("First",200, 200);
                wnd.setVisible(true);
            }
        });

        // to run as a thread2
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final createWindows wnd2 = new createWindows("Second", 200, 200);
                wnd2.setVisible(true);
            }
        });

    }
}
