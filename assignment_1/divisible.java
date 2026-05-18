import java.util.*;


public class divisible{

public static void main (String args[]){

Scanner sc = new Scanner(System.in);

int value = sc.nextInt();
  value = value%10;

if(value==0 || value == 5)
{
System.out.println("Divisible by 5");
}
else{

System.out.println("Not Divisible");
}
sc.close();
}
}
