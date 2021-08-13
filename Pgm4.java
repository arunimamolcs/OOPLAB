import java.util.Scanner;
class Matrix
{
int i,j,n,m;
Scanner in =new Scanner(System.in);
int myarray1[][]=new int[3][3];
int myarray2[][]=new int[3][3];
int myarray3[][]=new int[3][3];
void read()
{
System.out.println("Enter the row size of  array:");
 n=in.nextInt();
System.out.println("Enter the  coumn size of array:");
 m=in.nextInt();
System.out.println("Enter the elements of first array:");
for( i=0; i<n; i++)
{
for( j=0; j<m; j++)
  myarray1[i][j]=in.nextInt();
}


System.out.println("Enter the elements of second array:");

for( i=0; i<n; i++)
{
for( j=0; j<m; j++)

 myarray2[i][j]=in.nextInt();

}


}

void display()
{
System.out.println("  elements in matrix form :");
for( i=0; i<n; i++)
{
for( j=0; j<m; j++)


System.out.print(myarray1[i][j]+"\t");
System.out.println();
}
System.out.println("  elements in matrix form :");
for( i=0; i<n; i++)
{
for( j=0; j<m; j++)


System.out.print(myarray2[i][j]+"\t");
System.out.println();
}
for(i=0; i<n; i++)
{
for( j=0; j<m; j++)

myarray3[i][j]=myarray1[i][j]+myarray2[i][j];
}

System.out.println("  elements after matrix addition");
for( i=0; i<n; i++)
{
for( j=0; j<m; j++)


System.out.print(myarray3[i][j]+"\t");
System.out.println();

}

}
}
class Pgm4
{
public static void main (String args[])
{
Matrix ob=new Matrix();
ob.read();
ob.display();
}
}

