import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by uservm on 07.06.16.
 */
public class Login extends JPanel implements ActionListener {



    JLabel user = new JLabel("Username");
    JLabel passw = new JLabel("Password");

    JTextField userTF = new JTextField();
    JPasswordField passTF = new JPasswordField();

    JPanel login = new JPanel(new GridLayout(3,2));


    JButton loginB = new JButton("Login");
    JButton registerB = new JButton("Register");


    JPanel panel = new JPanel();
    CardLayout cardL;

    Login(){
        setLayout(new CardLayout());

        login.add(user);
        login.add(userTF);

        login.add(passw);
        login.add(passTF);

        loginB.addActionListener(this);
        registerB.addActionListener(this);

        login.add(loginB);
        login.add(registerB);

        panel.add(login);

        add(panel, "login");

        cardL = (CardLayout) getLayout();

    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);

        Login login = new Login();

        frame.add(login);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}