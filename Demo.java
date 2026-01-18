import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo extends JFrame implements ActionListener {
    JButton ButtonLogin, ButtonForget, ButtonReset;

    public Demo() {
        getContentPane().setBackground(Color.WHITE);
        setSize(400, 300);
        setLocation(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel username = new JLabel("Username");
        username.setBounds(30, 20, 100, 20);
        JTextField Usernamefd = new JTextField();
        Usernamefd.setBounds(130, 20, 200, 30);

        JLabel password = new JLabel("Password");
        password.setBounds(30, 70, 100, 20);
        JPasswordField Passwordfd = new JPasswordField();
        Passwordfd.setBounds(130, 70, 200, 30);

        ButtonLogin = new JButton("Login");
        ButtonLogin.setBounds(30, 130, 90, 30);
        ButtonLogin.addActionListener(this);

        ButtonForget = new JButton("Forget");
        ButtonForget.setBounds(150, 130, 90, 30);
        ButtonForget.addActionListener(this);

        ButtonReset = new JButton("Close");
        ButtonReset.setBounds(270, 130, 90, 30);
        ButtonReset.addActionListener(this);

        add(username);
        add(Usernamefd);
        add(password);
        add(Passwordfd);
        add(ButtonLogin);
        add(ButtonForget);
        add(ButtonReset);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ButtonReset) {
            System.exit(0);  // Close the application
        } else if (e.getSource() == ButtonForget) {
            JOptionPane.showMessageDialog(this, "Password recovery process.");
        } else if (e.getSource() == ButtonLogin) {
            JOptionPane.showMessageDialog(this, "Attempting login...");
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setVisible(true);
    }
}
