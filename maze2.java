 class maze2
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
 h[2][3]="_";
 h[2][4]="_";
 h[2][5]="_";
 h[5][4]="_";
 h[4][4]="X";
 h[4][2]="|";
 h[5][2]="|";
 h[3][5]="|";
 h[4][5]="|";
 h[5][5]="|";
 
 h[1][3]="X";
 h[3][1]="X";
 h[6][2]="X";
 h[4][6]="X";
 h[6][6]="?";

 
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