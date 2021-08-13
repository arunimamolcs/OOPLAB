import java .util.Scanner;
class Oddeven
{
public static void main (String args[])
{
int num;
Scanner in =new Scanner(System.in);
System.out.println("Enter the number:");
num=in.nextInt();
if(num%2==0)
{
System.out.println(num+"the  number is even");
}
else
{
System.out.println(num +"the number is odd");
}
}
}

