import java.util.*;

public class calculator{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
 
System.out.println("Please enter the three numbers");
int no1= sc.nextInt();
int no2= sc.nextInt();
int no3=sc.nextInt();

if(no1>no2){
   if(no1>no3){
     System.out.println("the greater no is "+no1);
   }
   else{
           System.out.println("the greater no is "+no3);
}
}
else{
System.out.println("the greater no is "+no2);
}


sc.close();
}
}

