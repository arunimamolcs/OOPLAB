Class Rectangle
{
float length;
float breadth;
void setData(float a,folat b)
{
length=a;
breadth=b;
}
void getArea()
{
int area=length*breadth;
}
}
Class Pgm2
{
public static void main(String args[])
{
Rectangle ob=new Rectangle();
ob.setData(3,5);
ob.getArea();
System.out.println("Area="+area);
}
}