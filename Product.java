
import java.util.Scanner;
class Product
{
Scanner in =new Scanner(System.in);
float pcode,pname,price;
Product(float a,float b,folat c)
{
pcode=a;
pname=b;
price=c;
}
void price()
{
if(ob1.price>ob2.price && ob1.price>ob3.price)
{
System.out.println("product 1 having the lowest price.");
}
else if(ob2.price>ob1.price && ob2.price>ob3.price)
{
System.out.println("product 2 having the lowest price.");
}
else
{
System.out.println("product 3 having the lowest price.");
}
}
void display()
{
System.out.println("enter the product code");
pcode=in.nextInt();
System.out.println("enter the product name");
System.out.println("enter the product price");
}
}
class Pgm6
{
public static void main (String args[])
{
Product ob1=new  Product();
Product ob2=new  Product();
Product ob3=new  Product();
ob1.price();
ob2.price();
ob2.price();
ob1.display()
ob2.display();

ob3.dispaly();
}
}