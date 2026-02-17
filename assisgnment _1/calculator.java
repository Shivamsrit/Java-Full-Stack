import java.util.*;

public class calculator{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
 
System.out.println("Please enter the two numbers");
int no1= sc.nextInt();
int no2= sc.nextInt();

System.out.println("enter the operator which you perform");

char ch = sc.next().charAt(0);

if(ch == '*"){
System.out.println("answer is = "+ (no1*no2));
}
else if( ch == '/"){
System.out.println("answer is = "+ (no1/no2));
}
else if(ch == '+"){
System.out.println("answer is = "+ (no1+no2));
}
else if(ch == '-"){
System.out.println("answer is = "+ (no1-no2));
}
else{
System.out.println("Wrong Input");
}

sc.close();
}
}

