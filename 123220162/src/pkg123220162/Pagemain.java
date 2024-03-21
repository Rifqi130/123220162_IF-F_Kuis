/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220162;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Pagemain extends JFrame implements ActionListener{
    
    JLabel tul1 = new JLabel();
    JLabel tul2 = new JLabel();
    
    JButton ma = new JButton("Majalah Anak");
    JButton mr = new JButton("Majalah Remaja");
    JButton md = new JButton("Majalah Dewasa");
    
    
    Pagemain(String NIM){
        tul1.setText("Welcome, " + NIM);
        setVisible(true);
        setSize(720,720);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(tul1);
        tul1.setBounds(20, 40, 250, 30);
        add(tul2);
        tul2.setBounds(20, 70, 200, 30);
        
        add(ma);
        ma.setBounds(20, 100, 200, 30);
        ma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                majak();
            }
        });
        
        add(mr);
        mr.setBounds(20, 150, 200, 30);
        mr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                majre();
            }
        });
        
        add(md);
        md.setBounds(20, 200, 200, 30);
        md.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                majde();
            }
        });
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void majak(){
        String majak = ma.getText();
        dispose();
        new Pagebuy();
    }
    
    private void majre(){
        String majre = mr.getText();
        dispose();
        new Pagebuy();
    }
    
    private void majde(){
        String majde = md.getText();
        dispose();
        new Pagebuy();
    }
    
}
