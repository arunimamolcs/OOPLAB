
class CPU
{
float price;
RAM rob;
Processor pob;
CPU(float p,String rammemory,String rammanufacturer,String pmanufacturer,String pcore)
{
price=p;
rob=new RAM(rammemory,rammanufacturer);
pob=new Processor(pcore,pmanufacturer);
}
static class RAM
{
String rammemory;
String rammanufacturer;
RAM(String rammemory,String rammanufacturer)
{
this.rammemory=rammemory;
this.rammanufacturer=rammanufacturer;
}
}
class Processor
{
String pcore;
String pmanufacturer;
Processor(String pcore,String pmanufacturer)
{
this.pcore=pcore;
this.pmanufacturer=pmanufacturer;
}
}
void display()
{
System.out.println("price="+price);
System.out.println("RAM Memory=" +rob.rammemory);
System.out.println("RAM Manufacturer=" +rob.rammanufacturer);

System.out.println("Processor core="+pob.pcore);
System.out.println("Processor Manufacturer=" +pob.pmanufacturer);
}
}
class Pgm8
{
public static void main(String args[])
{
CPU cpu1=new CPU(1500,"40 GB","Rammanufacturer","20","4");

cpu1.display();
}
}


