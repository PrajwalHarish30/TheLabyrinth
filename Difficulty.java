 import java.io.*;
 class Difficulty
{char ch;
 void mode()throws Exception
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("\u000C");
 boolean f=false;
 do
{f=false;
 try 
{System.out.println("EASY Mode-You can reset the maze any number of times you want!"); 
 System.out.println("MEDIUM Mode-You can reset the maze 3 times and if you further try to reset,you will be caught!");
 System.out.println("HARD Mode-You can reset the maze 1 times and if you further try to reset,you will be caught!\n");
 System.out.println("Enter E for Easy,M for Medium and H for Hard Mode");
  
 String S=br.readLine();
 S=S.toUpperCase();
 ch=S.charAt(0);
 if(ch!='E'&&ch!='M'&&ch!='H')
 throw new Exception();
}
 catch(Exception e1)
{f=true;
 System.out.println("\u000C");}}

 while(f!=false); 
 
 switch(ch)
{
 case 'E':    Easy E1=new Easy();
              E1.main();
              break;
              
 case 'M':    Med M1=new Med();
              M1.main();
              break;
              
 case 'H':    Hard H1=new Hard();
              H1.main();
              break;
              
 default:     break;             
            }
        }
    }