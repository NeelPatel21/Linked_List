package Linked;
import java.util.Random;
import javax.swing.JOptionPane;
public class neell
{
     node no;
     public int f=-1;
     char u[]=new char[41];
     public neell()
     {
          no=new node();
          for(int i=1;i<=40;i++)
               u[i]='a';
     }
     int getnew() 
          {
               Random rand = new Random();
               int  n;
               for(;true;)
               {
                    n = rand.nextInt(50) + 1;
                    if(u[n]=='a')
                         break;
               }
               u[n]='#';
               return n;
          }
     void freeold(int p)
     {
          //no.k[p].x='\0';
          no.k[p].a=-1;
          u[p]='a';
     }
     public void insert()
     {
          if(!check())
          {
               JOptionPane.showMessageDialog(null,"free node is not available..","error",JOptionPane.PLAIN_MESSAGE);
               return;
          }
          String xz =JOptionPane.showInputDialog("enter element..");
          int x=Integer.parseInt(xz);
          int p=getnew();
          no.k[p].x=x;
          if(f==-1)
               no.k[p].a=-1;
          else
               no.k[p].a=f;
          f=p;
     }
     public void del()
     {
          String xz =JOptionPane.showInputDialog("enter element..");
          int x=Integer.parseInt(xz);
          int p=f;
          if(f==-1)
          {
               JOptionPane.showMessageDialog(null,"Linked list is empty..","error",JOptionPane.PLAIN_MESSAGE);
               return;     
          }
          if(no.k[p].x==x)
          {
               f=no.k[p].a;
               freeold(p);
               JOptionPane.showMessageDialog(null,x+" is deleted","delete operation",JOptionPane.PLAIN_MESSAGE);
               return;
          }
          for(;no.k[p].a!=-1&&no.k[no.k[p].a].x!=x;)
               p=no.k[p].a;
          if(no.k[no.k[p].a].x==x)
          {
               int t=no.k[p].a;
               no.k[p].a=no.k[no.k[p].a].a;
               freeold(t);
          }
          else
               JOptionPane.showMessageDialog(null,x+" is not found..","delete operation",JOptionPane.PLAIN_MESSAGE);
     }
     public int gv(int p)
     {
          return no.k[p].x;
     }
     boolean check()
     {
          for(int i=1;i<=40;i++)
               if(u[i]=='a')
                    return true;
          return false;
     }
     public int ga(int p)
     {
          if(no.k[p].a!=-1)
          return no.k[p].a;
          return 0;
     }
     public boolean used(int v)
     {
          if(u[v]=='#')
               return true;
          return false;
     }
}
