import java.io.*;
class Credits
   {
     static void cre()throws Exception
        {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          for(int i=17;i>0;i--)
            { 
              for(int j=i;j>0;j--)
                {System.out.println();}
              System.out.println("\t\tDesign Team: ROBOCOP GAMES");
              System.out.println("\t\tCoding Head: Prajwal Harish");
              System.out.println("\t\tTesting Team: ROBOCOP GAMES");
              System.out.println("\t\tExecutive Head: Prajwal Harish");
              System.out.println("\t\tMarketing Team: ROBOCOP GAMES");
              System.out.println("\t\tROBOCOP GAMES AND CO.");
              System.out.println("\t\tThank You for Playing-THE LABYRINTH");
              Thread.sleep(300);
              System.out.print("\u000C");}
          System.out.print("\t\tPress Enter to Continue...");
          br.read();
          System.out.print("\u000C");
          
        }
    }