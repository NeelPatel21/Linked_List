package linked_list;
import Linked.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class Linked_List extends JFrame
{
     int l;
     neell z=new neell();
     JTextArea f;
     JLabel f1;
     npanal t[]=new npanal[41];;
     JButton insertb,delb;
     Linked_List()
     {
          {
               int ji=300;
               f=new JTextArea("",1,1);
               f.setBounds(ji+50,450,50,20);
               f.setEditable(false);
               f.setBackground(new Color(0,50,120));
               f.setForeground(new Color(255,255,0));
               add(f);
               f1=new JLabel("First = ");
               f1.setBounds(ji,450,50,20);
               f1.setForeground(Color.BLACK);
               add(f1);
          }
          for(int i=1;i<t.length;i++)
          {
               t[i]=new npanal(i);
               t[i].setLocation(((i-1)%8)*110+20,((i-1)/8)*60+20);
               add(t[i]);
          }
          insertb=new JButton("insert");
          insertb.setBounds(50,450,100,20);
          insertb.setEnabled(true);
          Evi evi=new Evi();
          insertb.addActionListener(evi);
          add(insertb);
          delb=new JButton("delete");
          delb.setBounds(150,450,100,20);
          delb.setEnabled(true);
          Evd evd=new Evd();
          delb.addActionListener(evd);
          add(delb);
          setSize(900,600);
          setTitle("Linked List");
          setBackground(Color.DARK_GRAY);
          setLayout(null);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public static void main(String jarvis[])
     {
          Linked_List m=new Linked_List();
     }
     void act()
     {
          f.setText("");
          if(z.f!=-1)
               f.setText(Integer.toString(z.f));
          for(int i=1;i<=40;i++)
          {
               t[i].a.setText("");
               t[i].v.setText("");
               t[i].v.setBackground(new Color(60,60,60));
               t[i].a.setBackground(new Color(60,60,60));
               t[i].setBackground(new Color(60,60,60));
          }
          for(int i=0;i<=40;i++)
          {
               if(z.used(i))
               {
                    t[i].v.setText(Integer.toString(z.gv(i)));
                    String s=Integer.toString(z.ga(i));
                    if("0".equals(s))
                         s="";
                    t[i].a.setText(s);
                    t[i].v.setBackground(Color.BLACK);
                    t[i].a.setBackground(Color.BLACK);
                    t[i].setBackground(Color.BLACK);
               }
          }
     }
     public class Evi implements ActionListener
     {
          @Override
          public void actionPerformed(ActionEvent evi) {
                z.insert();
                    act();
          }
          
     }
     public class Evd implements ActionListener
     {
          @Override
          public void actionPerformed(ActionEvent evi) {
                z.del();
                    act();
          }
          
     }
}
