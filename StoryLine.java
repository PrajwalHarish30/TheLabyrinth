 import java.io.*;
 class StoryLine
{char ch;
 boolean f;
 String S;
 void Play()throws Exception
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("\u000C");
 Fill f1=new Fill(); 
 f1.logo();
 System.out.println("Hey!Welcome to 2050!");
 Thread.sleep(3000);
 System.out.println("Things have changed...Now we Robots rule over Humans...");
 Thread.sleep(3000);
 System.out.println("But don't worry!I'm on your side to help Humans regain the Earth");
 Thread.sleep(3000);
 System.out.println("Why?\nBecause I have done my calculations-In 2 years the world will perish if we Robots continue to rule Earth.");
 System.out.println("The Nature's Balance will be Destroyed and the world will come to an end");
 Thread.sleep(6000);
 System.out.println("My name is BUBBLEZ! I'm a Robot. I used to support my fellow Robots until I got to know about the consequences of our rule");
 Thread.sleep(3000);
 System.out.println("Your Name is?");
 f=false;
 do
{f=false;
 try 
{S=br.readLine();
 if(S.length()==0)throw new Exception();}
 catch(Exception e1)
{f=true;}}

 while(f!=false);
 
 System.out.println("Let's start "+S);
 Thread.sleep(3000);
 System.out.println("\u000C");
 
 f1.logo();
 System.out.println("Ever since the Robots began ruling, Life has changed.There are Robots Everywhere.The cops are not Humans now.They are Robots!");
 Thread.sleep(3000);
 System.out.println("They are your main enemy!If they spot you,you can not escape them.So be very careful!");
 Thread.sleep(3000);
 System.out.println("Oh!Here comes a cop!Hide Quickly by pressing H.The cop is 'X' you are 'O'");
 Thread.sleep(3000);
 System.out.println("\u000C"); 
 String a[][]=new String[1][5];
 a[0][0]="X";
 a[0][4]="O";
 a[0][1]=" ";
 a[0][2]=" ";
 a[0][3]=" ";
  int i=0;
  int j=0;
  for(;i<1;i++)
{for(;j<5;j++)
{System.out.print(a[i][j]+"\t");
                         }
 System.out.println();} 
 i=0;
 j=0;
 
 f=false;
 do
{f=false;
 
 while(a[0][4]!=" ")
{try 
{
 System.out.println("Enter H to hide");
 S=br.readLine();
 S=S.toUpperCase();
 ch=S.charAt(0);
 if(ch>='A'&&ch<='Z')
{
 if(ch=='H'){a[0][4]=" ";
             break;}
 
             else
 if(ch!='H'){
     
             if(j==3)
             {System.out.println("You have been spotted");
              System.exit(0);
              }
              else
             {System.out.println("With Every Wrong Move,the cop will Advance Forward");  
              Thread.sleep(1000);   
              a[i][j]=" ";
              a[i][j+1]="X";
              }}
              
              System.out.println("\u000C");
              for(int x=0;x<1;x++)
             {for(int y=0;y<5;y++)
             {System.out.print(a[x][y]+"\t");}
              System.out.println();}
              j++; }
              
              else
              throw new Exception();}
              
              catch(Exception e1)
              {f=false;
               System.out.println("\u000C");
               for(int o=0;o<1;o++)
              {for(int u=0;u<5;u++)
              {System.out.print(a[o][u]+"\t");
                         }
               System.out.println();} 
               }}}
              
              while(f!=false);
              
            
            
            
 
            
            
 f1.logo();
 System.out.println("\u000C");          
 System.out.println("Phew That was close!");
 Thread.sleep(2000);
 System.out.println("\u000C");
 
 f1.logo();
 System.out.println("Let me tell you how to win against the Evil-Robots");
 Thread.sleep(3000);
 System.out.println("There are 4 precious stones indicated by '?' in 4 Different Mazes");
 Thread.sleep(3000);
 System.out.println("Your Job is to navigate through the maze and procure the stone without being caught");
 Thread.sleep(3000);
 System.out.println("Press Enter to continue...");
 S=br.readLine();
 
 f=false;
 do
{f=false;
 try
{System.out.println("\u000C"); 
 System.out.println("Press 'I' to know the movement controls.[Recommended]");
 System.out.println("Press 'P' to proceed and play the game.");
 String v=br.readLine();
 v=v.toUpperCase();
 char g=v.charAt(0);
 
 if(g=='I')
 {Manual m1=new Manual();
  m1.Movement();
  m1.MazeInformation();
}
 else
 if(g=='P')
{break;} 
 
 if(g!='I'&&g!='P')
 throw new Exception();}
 
 catch(Exception e1)
{f=true;}}

 while(f!=false);
 
 System.out.println("\u000C");
 
 Difficulty d1=new Difficulty();
 d1.mode();
}
}