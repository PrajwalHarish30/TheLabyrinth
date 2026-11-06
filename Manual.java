 import java.io.*;
 class Manual
{
 void Movement()throws Exception
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
  System.out.println("\u000C");
  System.out.println("Enter 'W' for moving the 'O' in upward direction.");
  Thread.sleep(1000);
  System.out.println("Enter 'A' for moving the 'O' in left direction.");
  Thread.sleep(1000);
  System.out.println("Enter 'S' for moving the 'O' in downward direction.");
  Thread.sleep(1000);
  System.out.println("Enter 'D' for moving the 'O' in right direction.");
  Thread.sleep(1000);
  System.out.println("Press Enter To Continue...");
  String S=br.readLine();
   
}

 void MazeInformation()throws Exception
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
  System.out.println("\u000C");
  System.out.println("You are indicated by 'O' and the Robocops are indicated by 'X'.");
  Thread.sleep(1000);
  System.out.println("If you try to move to the 'X' mark, you will be caught and the maze will reset.");
  Thread.sleep(1000);
  System.out.println("If you are playing on MEDIUM or HARD difficulty, you will lose a life.");
  Thread.sleep(1000);
  System.out.println("Avoid the cops and reach the '?' mark in the maze.");
  Thread.sleep(1000);
  System.out.println("Press Enter to continue...");
  String S=br.readLine();
}
}