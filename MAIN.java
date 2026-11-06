 import java.io.*;
 class MAIN
{void PLAY()throws Exception
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 Intro I=new Intro();
 I.CDown();
 
 LScreen l1=new LScreen();
 l1.Loading();
  
 Fill f1=new Fill();
 f1.main();
 
 Name n1=new Name();
 n1.name();
 
 Hack H1=new Hack();
 H1.main();
 
 StoryLine S1=new StoryLine();
 S1.Play();
 
 Credits C1=new Credits();
 C1.cre();
}
}
 
  