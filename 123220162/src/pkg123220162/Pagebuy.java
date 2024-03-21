/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220162;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Pagebuy extends JFrame implements ActionListener{
    
    JLabel tul1 = new JLabel("Halaman Pembelian");
    
    JLabel kat = new JLabel("Kategori");
    JLabel har = new JLabel("Harga");
    JLabel jum = new JLabel("Jumlah");
    
    JLabel kate = new JLabel();
    
    JTextField injum = new JTextField();
    
    JLabel totalpem = new JLabel("Total Pembelian");
    JLabel harsa = new JLabel("Harga Satuan");
    JLabel juml = new JLabel("Jumlah");
    JLabel totalhar = new JLabel("Total Harga");
    
    JButton beli = new JButton("Beli");
    
    JButton back = new JButton("BACK");
    
    Pagebuy(){
        
        setVisible(true);
        setSize(720,720);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(tul1);
        tul1.setBounds(20, 40, 250, 30);
        
        add(kat);
        kat.setBounds(20, 100, 200, 30);
        add(har);
        har.setBounds(20, 140, 200, 30);
        add(jum);
        jum.setBounds(20, 180, 200, 30);
        
        add(kate);
        kate.setBounds(150, 100, 200, 30);
        add(injum);
        injum.setBounds(150, 180, 200, 30);
        
        add(totalpem);
        totalpem.setBounds(20, 220, 200, 30);
        add(harsa);
        harsa.setBounds(20, 260, 200, 30);
        add(juml);
        juml.setBounds(20, 300, 200, 30);
        add(totalhar);
        totalhar.setBounds(20, 340, 200, 30);
        
        add(back);
        back.setBounds(20, 220, 200, 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buck();
            }
        });
        
        add(back);
        back.setBounds(20, 500, 200, 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buck();
            }
        });
    }
    
    private void buck(){
        dispose();
        new Login();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}