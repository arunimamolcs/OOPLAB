class Rectangle
{
double length;
double breadth;
void setData(double a,double b)
{
length=a;
breadth=b;
}
double getArea()
{
double area;
area=length*breadth;
return area;
}
}
class Pgm2
{
public static void main(String args[])
{
double Area;
Rectangle ob1=new Rectangle();
Rectangle ob2=new Rectangle();
Rectangle ob3=new Rectangle();
ob1.setData(12.4,13);
Area=ob1.getArea();
System.out.println("Area of rectangle R1=" +Area);
ob2.setData(10.5,9);
Area=ob2.getArea();
System.out.println("Area of rectangle R2=" +Area);
ob3.setData(13,14);


 Area=ob3.getArea();


System.out.println("Area of rectangle R3=" +Area);
}
}