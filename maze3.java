 class maze3
{ String h[][]=new String[8][8];
 
 void main()
{
 System.out.println("\u000C"); 
 for(int j=0;j<8;j++)
{h[j][0]="|";
 h[j][7]="|";
 h[0][j]="_";
 h[7][j]="_";}
 
 h[1][1]="O";
 h[1][2]="|";
 h[2][2]="|";
 h[3][2]="|";
 h[4][2]="|";
 h[6][2]="|";
 h[2][4]="|";
 h[3][4]="|";
 h[4][4]="|";
 h[5][4]="|";
 h[6][6]=" ";
 h[7][6]="_";
 h[7][7]="_";
 h[6][4]=" ";
 h[2][6]="_";
 h[4][5]="_";
 h[1][6]="?";
 h[6][6]=" ";
 h[1][4]="X";
 h[6][6]="_";
 h[6][1]="X";
 
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