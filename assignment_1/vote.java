import java.util.*;

public class vote{
public static void main (String args[])
{

Scanner sc= new Scanner(System.in);
int age = sc.nextInt();

if(age>=18){
System.out.println("Eligible for vote");
}
else{
System.out.println("not Eligible");
}
sc.close();
}
}