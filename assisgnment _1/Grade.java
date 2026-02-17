import java.util.*;

public class Grade{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
 
int marks = sc.nextInt();
}
if(marks<=100 || marks>=81){
System.out.println("Grade :- A");
}
else if( marks<=80 || marks>=60){
System.out.println("Grade:- B");
}
else{
System.out.println("Grade:- C);
}

sc.close();
}
}

