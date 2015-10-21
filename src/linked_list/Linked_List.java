package linked_list;
import Linked.*;
import javax.swing.*;
import java.awt.event.*;
public class Linked_List extends JFrame
{
     int l;
     neell z=new neell();
     JTextArea t[],teg[],v[],f,f1;
     JButton insertb,delb;
     Linked_List()
     {
          t=new JTextArea[41];
          v=new JTextArea[41];
          teg=new JTextArea[41];
          {
               int ji=300;
               f=new JTextArea("",1,1);
               f.setBounds(ji+50,450,50,20);
               f.setEnabled(false);
               add(f);
               f1=new JTextArea("First",1,1);
               f1.setBounds(ji,450,50,20);
               f1.setEnabled(false);
               add(f1);
          }
          for(int i=1;i<t.length;i++)
          {
               t[i]=new JTextArea("",1,1);
               t[i].setRows(1);
               t[i].setColumns(1);
               t[i].setBounds(((i-1)%8)*100+70,((i-1)/8)*50+20,25,20);
               t[i].setEnabled(false);
               add(t[i]);
               v[i]=new JTextArea("",1,1);
               v[i].setRows(1);
               v[i].setColumns(1);
               v[i].setBounds(((i-1)%8)*100+95,((i-1)/8)*50+20,25,20);
               v[i].setEnabled(false);
               add(v[i]);
               teg[i]=new JTextArea(Integer.toString(i),1,1);
               teg[i].setRows(1);
               teg[i].setColumns(1);
               teg[i].setBounds(((i-1)%8)*100+70,((i-1)/8)*50+40,50,20);
               teg[i].setEnabled(false);
               add(teg[i]);
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
               t[i].setText("");
               v[i].setText("");
          }
          for(int i=0;i<=40;i++)
          {
               if(z.used(i))
               {
                    t[i].setText(Integer.toString(z.gv(i)));
                    String s=Integer.toString(z.ga(i));
                    if("0".equals(s))
                         s="";
                    v[i].setText(s);
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