
package pkg123220162;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Login extends JFrame implements ActionListener{
    
    JLabel open = new JLabel("Hallo, Dimohon untuk Login");
    
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    
    JTextField nim = new JTextField();
    JTextField inpass = new JTextField();
    
    JButton login = new JButton("Login");
    
    
    Login(){
        setVisible(true);
        setSize(720,720);
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(open);
        open.setBounds(20, 40, 250, 30);
        
        add(user);
        user.setBounds(20, 100, 150, 30);
        add(pass);
        pass.setBounds(20, 140, 150, 30);
        
        add(nim);
        nim.setBounds(150, 100, 150, 30);
        add(inpass);
        inpass.setBounds(150, 140, 150, 30);
        
        add(login);
        login.setBounds(20, 200, 150, 30);
        login.addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String username = nim.getText();
        String password = inpass.getText();
        
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username dan Paswword Harus dilengkapi dahulu", "Peringatan!!!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            String NIM = nim.getText();
            dispose();
            new Pagemain(NIM);
        }
        
        
    }
    
    
}