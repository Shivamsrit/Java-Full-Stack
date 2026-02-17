import java.util.*;

public class pass_or_fail{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
 
int marks = sc.nextInt();
if(marks>=40){
System.out.println("passed");
}
else{
System.out.println("fail");
}

sc.close();
}
}

