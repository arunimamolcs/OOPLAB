 import java.util.*;

class product{
    int pcode;
    String pname;
    double price;

    void setdata(int code,String name,double prc ){
        pcode=code;
        pname=name;
        price=prc;       
    }
    void getdata(){
        System.out.println("\nProduct name : "+pname);
        System.out.println("\nProduct code : "+pcode);
        System.out.println("Product price : "+price);
    }
    void lowprice(product p1,product p2){

        if(price<=p1.price && price<=p2.price)
            System.out.println(pname+" has the lowest price=rs."+price);  
        else if (p1.price<=price && p1.price<=p2.price)  
            System.out.println(p1.pname+" has the lowest price=rs."+p1.price);  
        else  
        //prints c if the above conditions are false  
            System.out.println(p2.pname+" has the lowest price=rs."+p2.price);  
    }
}
class Pgm6scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int code;
        double price;
        String name;
        product prod1=new product();
        product prod2=new product();
        product prod3=new product();
        System.out.println("Enter the details of 1st product : ");
        System.out.println("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        prod1.setdata(code, name, price);

        System.out.println("Enter the details of 2nd product : ");
        sc.nextLine();
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        prod2.setdata(code, name, price);

        System.out.println("Enter the details of 3rd product : ");
        sc.nextLine();
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        prod3.setdata(code, name, price);

        System.out.println("Product 1 ");
 System.out.println("******* ");
        prod1.getdata();
        System.out.println("Product 2 ");
 System.out.println("******* ");
        prod2.getdata();
        System.out.println("Product 3 ");
 System.out.println("******* ");
        prod3.getdata();

        prod1.lowprice(prod2, prod3);

    }
}