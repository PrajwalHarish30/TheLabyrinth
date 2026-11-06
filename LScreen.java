 import java.io.*;
 class LScreen
{
 void Loading()throws Exception
{
 Fill f1=new Fill();
 System.out.println("\u000C");
 for(int i=1;i<2;i++)
{
 f1.logo();
 System.out.println("\t\t\t\t      LOADING");
 System.out.print("\t\t");
 for(int j=1;j<50;j++)
{System.out.print(">");
 Thread.sleep(70);
 } 
}
  System.out.println("\u000C");
}
}
 
 