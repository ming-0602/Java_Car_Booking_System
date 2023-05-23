package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class Login extends JFrame {

    private JFrame jf;
    private JButton jButton[];
    //    private String buttonNames[] = {"Login", "Exit"};

    private JTextField inputtext1;
    private JTextField inputtext2;

    public Login(){
        //page title
        super("Car Booking System");

        JPanel userfield = new JPanel();
        JPanel passfield = new JPanel();
        JPanel jpbut = new JPanel(new FlowLayout(FlowLayout.CENTER, 0,25));
        JPanel all = new JPanel(new BorderLayout(2,3));
//        JFrame jf = new JFrame();

        JTextField text1 = new JTextField("Username: ");
        text1.setEditable(false);
        userfield.add(text1, BorderLayout.NORTH);
        inputtext1 = new JTextField("");
        inputtext1.setPreferredSize(new Dimension(100, 20));
        userfield.add(inputtext1);
        userfield.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));

        JTextField text2 = new JTextField("Password: ");
        text2.setEditable(false);
        passfield.add(text2,BorderLayout.NORTH);
        inputtext2 = new JTextField("");
        inputtext2.setPreferredSize(new Dimension(100, 20));
        passfield.add(inputtext2, BorderLayout.NORTH);
        passfield.setBorder(BorderFactory.createEmptyBorder(0, 0, 200, 0));

        JButton butlogin = new JButton("Login");
//        jpbut.setBounds(10,50, 10, 10);
        jpbut.add(butlogin);
//        add(jpbut,BorderLayout.NORTH);
        jpbut.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        butlogin.addActionListener(new ProceedLogin());

        all.add(userfield, BorderLayout.NORTH);
        all.add(passfield, BorderLayout.NORTH);
        all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));

        add(all);
        add(jpbut, BorderLayout.SOUTH);

        setSize(600, 200);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);

        setVisible(true);
    }

    public static void main(String[] args) {
        Login login = new Login();
    }


    private class ProceedLogin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            String actinput1 = inputtext1.getText();
//            System.out.println(actinput1);
            String actinput2 = inputtext2.getText();

            System.out.println(actinput1.equals("Admin"));
            System.out.println(actinput2.equals("12345"));


            if(actinput1.equals("Admin") && actinput2.equals("12345") ){

                MainMenu mm = new MainMenu();
                mm.setVisible(true);

                Login.this.dispose();


            }else {
                JOptionPane.showMessageDialog(null,"Incorrect input!", "Something Wong", 1);
            }

        }
    }
}
