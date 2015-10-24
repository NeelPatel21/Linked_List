package Linked;
import java.awt.Color;
import javax.swing.*;
public class npanal extends javax.swing.JPanel {

     JLabel l;
     public JTextArea a;
     public JTextArea v;
     public npanal(int x) {
          l=new JLabel(Integer.toString(x));
          a=new JTextArea("",1,1);
          v=new JTextArea("",1,1);
          v.setBounds(0,0,50,20);
          v.setEditable(false);
          v.setForeground(new Color(0,255,0));
          v.setBackground(new Color(60,60,60));        
          add(v);
          a.setBounds(50,0,50,20);
          a.setForeground(new Color(0,255,255));
          a.setBackground(new Color(60,60,60));
          a.setEditable(false);
          add(a);
          l.setBounds(0,30,100,20);
          l.setForeground(new Color(255,0,0));
          l.setHorizontalAlignment(0);
          add(l);
          setSize(100,50);
          setLayout(null);
          setBackground(new Color(60,60,60));
          setVisible(true);
     }
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
     }// </editor-fold>//GEN-END:initComponents


     // Variables declaration - do not modify//GEN-BEGIN:variables
     // End of variables declaration//GEN-END:variables

    
}
