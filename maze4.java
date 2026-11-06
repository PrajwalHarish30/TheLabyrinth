 class maze4
{String h[][]=new String[8][8];
 
 void main()
{
 System.out.println("\u000C"); 
 for(int j=0;j<8;j++)
{h[j][0]="|";
 h[j][7]="|";
 h[0][j]="_";
 h[7][j]="_";}
 
 h[1][1]="O";
 h[2][1]="_";
 h[2][2]="_";
 h[2][4]="_";
 h[2][5]="_";
 h[3][5]="|";
 h[4][2]="_";
 h[4][3]="_";
 h[4][4]="_";
 h[4][5]="|";
 h[4][6]="_";
 h[5][3]="|";
 h[6][1]="_";
 h[6][5]="_";
 h[6][6]="?";
 h[1][6]="X";
 h[3][4]="X";
 
 for(int i=0;i<8;i++)
{for(int j=0;j<8;j++)
{if(h[i][j]==null)
{h[i][j]=" ";}}}

 for(int i=0;i<8;i++)
{for(int j=0;j<8;j++)
{System.out.print(h[i][j]+"   ");} 
 
 System.out.println("\n");}
                     }
                }  