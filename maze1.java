 class maze1
 {String h[][]=new String[8][8];
void main()
{ 
 System.out.println("\u000C");
 for(int j=0;j<8;j++)
{h[0][j]="_";
 h[j][0]="|";
 h[7][j]="_";
 h[j][7]="|";} 
 
 
 h[1][1]="O";
 
 h[1][2]="|";
 h[2][2]="|";
 h[4][2]="|";
 h[5][2]="|";
 h[4][4]="|";
 h[5][4]="|";
 h[6][4]="|";
 
 h[4][1]="_";
 h[4][2]="_";
 h[2][3]="_";
 h[2][4]="_";
 h[2][5]="_";
 h[4][5]="_";
 h[6][5]="_";
 h[0][0]="_";
 h[7][7]=" ";
 h[5][3]="X";
 h[1][4]="X";
 
 for(int i=0;i<8;i++)
{for(int j=0;j<8;j++)
{if(h[i][j]==null)
{h[i][j]=" ";}}}
 h[6][6]="?";
 for(int i=0;i<8;i++)
{for(int j=0;j<8;j++)
{System.out.print(h[i][j]+"   ");} 
 System.out.println("\n");}
}
}
 

