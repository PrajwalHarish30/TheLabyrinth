 class Fill
{void load()throws Exception
      { 
          System.out.print("\u000C");
         for(int i=1;i<4;i++)
           {
             System.out.print("\t\t  Loading\n\t\t");
             for(int j=1;j<=11;j++)
                {
                  System.out.print(">");
                  Thread.sleep(70);
                }
             System.out.print("\u000C"); 
           }         
        }   
    void Logo1()
 {                
      System.out.println("                                      _______");
      System.out.println("                                     / _   _ \\");
      System.out.println("                                   _|  O   O  |_");
      System.out.println("              ROBOCOP             |_|    v    |_|           GAMES        ");
      System.out.println("                                     \\ |___| /");
      System.out.println("                                      |     |");
      System.out.println("                                     /_______\\\n");
      System.out.println("                                      PRESENTS");
     }
    
  void Logo2()  
  {     
      System.out.println("                                      _______");
      System.out.println("                                     / _   _ \\");
      System.out.println("                                   _|  O   O  |_");
      System.out.println("              ROBOCOP             |_|    v    |_|           GAMES        ");
      System.out.println("                                     \\ |---| /");
      System.out.println("                                      ||___||");
      System.out.println("                                     /_______\\\n");
      System.out.println("                                      PRESENTS");
     }
  
   void main()throws Exception
{
  Fill l1=new Fill();
  System.out.println("\u000C");
  for(int i=1;i<10;i++)
{l1.Logo1();
 Thread.sleep(300);
 System.out.println("\u000C");
 l1.Logo2();
 Thread.sleep(300);
 System.out.println("\u000C");
                }
            }
    void logo()
   { System.out.println("                                      _______");
     System.out.println("                                     / _   _ \\");
     System.out.println("                                   _|  O   O  |_");
     System.out.println("                                  |_|    v    |_|");
     System.out.println("                                     \\ |___| /");
     System.out.println("                                      |     |");
     System.out.println("                                     /_______\\\n");
    }
}