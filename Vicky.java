import java.io.*;

class Vicky
{
public static void main(String arg[]) 
{
try 
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader hr = new BufferedReader(isr);
System.out.println("vickymall");
System.out.println("no8,kknagar,chennai");
System.out.println("---------------");
System.out.println("bill");
System.out.println("enter the serial number :");
String s1 = hr.readLine();
System.out.println("enter the particular :"); 
String s2 = hr.readLine();
System.out.println("enter the rate:"); 
String s3 = hr.readLine();
int a = Integer.parseInt(s3);
System.out.println("enter the quantity:"); 
String s4 = hr.readLine();
int b = Integer.parseInt(s4);
System.out.println("result"); 
int c=a*b;
System.out.println("total amount:"+c);
int d= c*10/1000;
System.out.println("total amount:"+d);
int e = c+d;
System.out.println("grand total :"+e);
System.out.println("--------------");
System.out.println("thank you");
} catch (Exception e)
 {  
System.out.println("Error: " + e.getMessage());  
}
}
}
