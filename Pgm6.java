
class Product
{

int pcode;
double price;
 String pname;
Product(int a,String b,double c)
{
pcode=a;
pname=b;
price=c;
}
 void display()
{
System.out.println("product code="+pcode);

System.out.println("product name="+pname);
System.out.println("Enter the product price="+price);

}

}
class Pgm6
{
public static void main (String args[])
{
Product ob1=new  Product(101,"biscuit",50);
Product ob2=new  Product(102,"powder",100);
Product ob3=new  Product(103,"choclate",200);
System.out.println("Product 1 details");
System.out.println("\n************");
ob1.display();
System.out.println("\nProduct 2 details");
System.out.println("\n************");
ob2.display();
System.out.println("\nProduct 3 details");
System.out.println("\n************");
ob3.display();
if(ob1.price>ob2.price && ob1.price>ob3.price)
{
System.out.println("\nprice of product one is larger");
ob1.display();
}
else if(ob2.price>ob1.price && ob2.price>ob3.price)

{
System.out.println("\nprice of product two is larger");
ob2.display();
}
else
{
System.out.println("\nprice of product three is larger");
ob3.display();
}


}
}