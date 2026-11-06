 import java.io.*;
 class Intro
{void Three()
{System.out.println("\n\n");
 System.out.println("\t\t_____");
 System.out.println("\t\t     |");
 System.out.println("\t\t_____|");
 System.out.println("\t\t     |");
 System.out.println("\t\t_____|");
} 
 void Two()
{System.out.println("\n\n");
 System.out.println("\t\t_____");
 System.out.println("\t\t     |");
 System.out.println("\t\t_____|");
 System.out.println("\t\t|     ");
 System.out.println("\t\t|_____");
}

 void One()
{System.out.println("\n\n");
 System.out.println("\t\t   |");
 System.out.println("\t\t   |");
 System.out.println("\t\t   |");
 System.out.println("\t\t   |");
 System.out.println("\t\t   |");
}

 void CDown()throws Exception
{Intro i1=new Intro();
 
 System.out.println("\u000C");
 i1.Three();
 Thread.sleep(1000);
 System.out.println("\u000C");
 i1.Two();
 Thread.sleep(1000);
 System.out.println("\u000C");
 i1.One();
 Thread.sleep(1000);
 System.out.println("\u000C");
}
}
 
 

 
 
   