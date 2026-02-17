import java.util.*;

public class even_or_odd{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int number=sc.nextInt();

int t = number%10;

if(t==0 || t==2 || t==4 || t==6 || t==8)
{
System.out.println("even number");
}
else{
System.out.println("odd number");
}
sc.close();
}
}


