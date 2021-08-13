import java.util.Scanner;
class Symmetricornot
{
int i,n,m,j,flag=0;
Scanner in =new Scanner(System.in);
int myarray[][]=new int[3][3];
void read()
{
System.out.println("Enter the row size of array:");
 n=in.nextInt();
System.out.println("Enter the column size of array:");
 m=in.nextInt();

System.out.println("Enter the elements of array:");
for( i=0; i<n; i++)
{
for(j=0; j<m; j++)
  myarray[i][j]=in.nextInt();
}
}
void display()
{
System.out.println("  elements in matrix form:-");
for(i=0; i<n; i++)
{
for( j=0; j<m; j++)


System.out.print(myarray[i][j]+"\t");
System.out.println();
}
System.out.println("  elements in  transpose matrix :-");
for(i=0; i<n; i++)
{
for( j=0; j<m; j++)


System.out.print(myarray[j][i]+"\t");
System.out.println();

}


for(i=0; i<n; i++)
{
for(j=0; j<m; j++)
{
if(myarray[i][j]!=myarray[j][i])
{
flag=1;
}
}
}
if(flag==0){

System.out.println("it is symmetric");
}
else
{
System.out.println("it is not symmetric");
}

}

}

class Pgm5
{
public static void main (String args[])
{
Symmetricornot ob=new Symmetricornot();
ob.read();
ob.display();
}
}

