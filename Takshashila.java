import java.io.*;
class Takshashila 
{
public static void main(String args[]) throws IOException 
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr); 
System.out.println("Takshashila University");
System.out.println("----------------------");
System.out.println("Student Mark List");
System.out.print("Student Enroll: ");
int enrollNumber = Integer.parseInt(br.readLine()); 
System.out.print("Student Name: ");
String studentName = br.readLine();
System.out.print("Java Marks: ");
int javaMarks = Integer.parseInt(br.readLine());
System.out.print("SET Marks: ");
int setMarks = Integer.parseInt(br.readLine());
System.out.print("CN Marks: ");
int cnMarks = Integer.parseInt(br.readLine());
int totalMarks = javaMarks + setMarks + cnMarks;
double averageMarks = totalMarks / 3.0; 
System.out.println("\nResult");
System.out.println("Total: " + totalMarks);
System.out.println("Average: " + averageMarks);
    }
}