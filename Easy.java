 import java.io.*;
 class Easy
 
{String h[][]=new String[8][8];
 char ch;
 String S;
 boolean f;
 void display()
{
        System.out.println("\u000C");
         for(int i=0;i<8;i++)
        {for(int j=0;j<8;j++)
        {System.out.print(h[i][j]+"   ");}
         System.out.println("\n");
         }
         }
         
 void main()throws Exception
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 Fill F1=new Fill();
 Btw b1=new Btw();
 System.out.println("\u000C");
 start:
{ for(int x=1;x<2;x++)
{

   if(x==1)
  {   b1.maze1();
      F1.load();
      maze1 m1=new maze1();
      m1.main();
      h=m1.h;
      int i=1,j=1;

  
    while(true)
    
   {
     f=false;
   
    do
    {f=false;

    try
    { 
       
    System.out.println("Enter the movement(w/a/d/s).\nEnter r to reset the maze");
    ch=' ';
    S=br.readLine();
    S=S.toLowerCase();
    ch=S.charAt(0);
    if(ch!='w'&&ch!='a'&&ch!='s'&&ch!='d'&&ch!='r')
    {throw new Exception();
     }
    else
    {f=false;}
    }
     catch(Exception e1)
    {f=true;
     System.out.println("\u000C");   
     m1.main();}}
    
     while(f!=false);   
    
      
     switch(ch)
     {
       case 'w':i=i-1;
          
          if(h[i][j].equals(" "))
          {h[i][j]="O";
           display();}
           else
           if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze1 m=new maze1();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            } 
            
           else
           
           if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
          {
           
           i=i+1;//check condition for blocks in between
           display();
           System.out.println("Wrong Move");}
           
           break;
           
       case 'a':j=j-1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze1 m=new maze1();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            } 
            
                   else
                   
                if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
                {         
                  j=j+1;
                  display();
                  System.out.println("Wrong Move");}
                  break;
           
       case 's':i=i+1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze1 m=new maze1();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            } 
            
                else
                if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))                
               {          
                i=i-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
           
           
       case 'd':j=j+1;
          
               if(h[i][j].equals(" "))
              {h[i][j]="O";
               display();}    
               else
               if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze1 m=new maze1();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            } 
            
                else
               if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
               {
                j=j-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
       case 'r':System.out.println("\u000C");
                maze1 m=new maze1();
                m.main();
                h=m.h;
                i=1;j=1;
                display();
                break;
           
       default:System.out.println("\u000C");
               display();
               System.out.println("Invalid");
                }
               
     if(h[i][j].equals("?"))
              {h[i][j]="O";
               System.out.println("\u000C");
               display();
               System.out.println("You Win!!!");
               Thread.sleep(2000);
               System.out.println("\u000C");

               
             //Maze2
             
             b1.maze2();
             F1.load();
             maze2 m2=new maze2();
             m2.main();
             h=m2.h;
             i=1;j=1;
        while(true)
   {
       f=false;
       
       do
    {  f=false;
        
       try
   {    
    System.out.println("Enter the movement(w/a/d/s).\nEnter r to reset the maze");
    ch=' ';
    S=" ";
    String S1=br.readLine();
    S1=S1.toLowerCase();
    ch=S1.charAt(0);
    if(ch!='w'&&ch!='a'&&ch!='s'&&ch!='d'&&ch!='r')
    {throw new Exception();
     }
    else
    {f=false;}
    }
     catch(Exception e1)
    {f=true;
     System.out.println("\u000C");   
     m2.main();}}
    
     while(f!=false);   
    
     switch(ch)
     {
       case 'w':i=i-1;
          
          if(h[i][j].equals(" "))
          {h[i][j]="O";
           display();}
           else
           
           if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze2 m=new maze2();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            } 
            
           else
           
           if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
          {
           
           i=i+1;//check condition for blocks in between
           display();
           System.out.println("Wrong Move");}
           
           break;
           
       case 'a':j=j-1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze2 m=new maze2();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
            
            else
            
                if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
                {         
                  j=j+1;
                  display();
                  System.out.println("Wrong Move");}
                  break;
           
       case 's':i=i+1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze2 m=new maze2();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
            else
            
            
                if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
               {          
                i=i-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
           
           
       case 'd':j=j+1;
          
               if(h[i][j].equals(" "))
              {h[i][j]="O";
               display();}    
               else
               if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze2 m=new maze2();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
            else
               if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
               {
                j=j-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
       case 'r':System.out.println("\u000C");
                maze2 m=new maze2();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
                break;
           
       default:System.out.println("\u000C");
               display();
               System.out.println("Invalid");
               continue;}
               
               
       if(h[i][j].equals("?"))
      {h[i][j]="O";
       System.out.println("\u000C");
       display();
       System.out.println("You Win!!!");
       Thread.sleep(2000);
       System.out.println("\u000C");
               
     
    //Maze3
        b1.maze3();
        F1.load();
        maze3 m3=new maze3(); 
        m3.main();
        h=m3.h;
        i=1;j=1;
  while(true)
 {  f=false;
    
    do
  { f=false;
      
    try
   {          
    System.out.println("Enter the movement(w/a/d/s).\nEnter r to reset the maze");
    ch=' ';
    S=" ";
    S=br.readLine();
    S=S.toLowerCase();
    ch=S.charAt(0);
    if(ch!='w'&&ch!='a'&&ch!='s'&&ch!='d'&&ch!='r')
    {throw new Exception();
     }
    else
    {f=false;}
    }
     catch(Exception e1)
    {f=true;
     System.out.println("\u000C");   
     m3.main();}}
    
     while(f!=false);   
     
    
     switch(ch)
     {
       case 'w':i=i-1;
          
          if(h[i][j].equals(" "))
          {h[i][j]="O";
           display();}
           else
           if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze3 m=new maze3();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
            else
            
           if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
          {
           
           i=i+1;//check condition for blocks in between
           display();
           System.out.println("Wrong Move");}
           
           break;
           
       case 'a':j=j-1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze3 m=new maze3();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
            else
            
                if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
                {         
                  j=j+1;
                  display();
                  System.out.println("Wrong Move");}
                  break;
           
       case 's':i=i+1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze3 m=new maze3();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
                else
            
               if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
               {          
                i=i-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
           
           
       case 'd':j=j+1;
          
               if(h[i][j].equals(" "))
              {h[i][j]="O";
               display();}    
               else
               if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze3 m=new maze3();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
                else
               if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
               {
                j=j-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
       case 'r':System.out.println("\u000C");
                maze3 m=new maze3();
                m.main();
                h=m.h;
                i=1;j=1;
                display();
                break;
           
       default:System.out.println("\u000C");
               display();
               System.out.println("Invalid");
               continue;}
               
           if(h[i][j].equals("?"))
          {h[i][j]="O";
           System.out.println("\u000C");
           display();
           System.out.println("You Win!!!");
           Thread.sleep(2000);
           System.out.println("\u000C");
           
           //Maze4
            b1.maze4();
            F1.load();
            maze4 m4=new maze4();
            m4.main();
            h=m4.h;
            i=1;
            j=1;
  while(true)
 {  f=false;
    
    do
   {f=false;
    
    try
   {         
    System.out.println("Enter the movement(w/a/d/s).\nEnter r to reset the maze");
    ch=' ';
    S=" ";
    S=br.readLine();
    S=S.toLowerCase();
    ch=S.charAt(0);
    if(ch!='w'&&ch!='a'&&ch!='s'&&ch!='d'&&ch!='r')
    {throw new Exception();
     }
    else
    {f=false;}
    }
     catch(Exception e1)
    {f=true;
     System.out.println("\u000C");   
     m4.main();}}
    
     while(f!=false);   
     
    
     switch(ch)
     {
       case 'w':i=i-1;
          
          if(h[i][j].equals(" "))
          {h[i][j]="O";
           display();}
           else
           if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze4 m=new maze4();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
            else
           if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
          {
           
           i=i+1;//check condition for blocks in between
           display();
           System.out.println("Wrong Move");}
           
           break;
           
       case 'a':j=j-1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze4 m=new maze4();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
                else
            
                if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
                {         
                  j=j+1;
                  display();
                  System.out.println("Wrong Move");}
                  break;
           
       case 's':i=i+1;
                
                if(h[i][j].equals(" "))
               {h[i][j]="O";
                display();}
                else
                if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze4 m=new maze4();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
                else
                
                if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
               {          
                i=i-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
           
           
       case 'd':j=j+1;
          
               if(h[i][j].equals(" "))
              {h[i][j]="O";
               display();}    
               else
               if(h[i][j].equals("X"))
           
          {     System.out.println("\u000C");
                System.out.println("You were caught by the Cop. The Maze Will Reset.");
                System.out.println("Press Enter");
                String ent=br.readLine();
                System.out.println("\u000C");
                maze4 m=new maze4();
                m.main();
                i=1;
                j=1;
                h=m.h;
                display();
            }
                else
                
               if(h[i][j].equals("|")||h[i][j].equals("_")||h[i][j].equals("O"))
               {
                j=j-1;
                display();
                System.out.println("Wrong Move");}
                break;
           
       case 'r':System.out.println("\u000C");
                maze4 m=new maze4();
                m.main();
                h=m.h;
                i=1;j=1;
                display();
                break;
           
       default:System.out.println("\u000C");
               display();
               System.out.println("Invalid");
                }
               
     if(h[i][j].equals("?"))
              {h[i][j]="O";
               System.out.println("\u000C");
               display();
               b1.End();
               Thread.sleep(2000);
               break start;}}}}
               
            }
        }
    }
}
}
}
}
}
}                                                           