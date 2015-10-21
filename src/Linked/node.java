package Linked;
public class node
{
     public str k[];
               node()
               {
                    k=new str[41];
                    for(int i=1;i<=40;i++)
                    {
                         k[i]=new str();
                         k[i].a=-1;
                    }
               } 
}
class str
{
     int x,a;
}