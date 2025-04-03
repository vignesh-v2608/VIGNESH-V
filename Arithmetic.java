import java.io.*;

class Arthi
{
public static void main(String arg[]) 
{
try 
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Arithmetic Operations");
System.out.println("------------------");
System.out.println("Enter the first number:");
String s1 = br.readLine();
int a = Integer.parseInt(s1);
System.out.println("Enter the second number:");
String s2 = br.readLine();
int b = Integer.parseInt(s2);
System.out.println("Result");
int c = a + b;
System.out.println("Addition: " + c);
int d = a - b;
System.out.println("Subtraction: " + d);
int e = a * b;
System.out.println("Multiplication: " + e);
 int f = a / b;
System.out.println("Division: " + f);              
} catch (Exception e)
 {  
System.out.println("Error: " + e.getMessage());  
}
}
}
