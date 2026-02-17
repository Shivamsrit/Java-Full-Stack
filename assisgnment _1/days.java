import java.util.*;

public class day{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
 
System.out.println("Please enter the number between 1-7");
int day= sc.nextInt();
}
if(day==1){
System.out.println("Monday");
}
else if( day==2){
System.out.println("tuesday");
}
else if(day==3){
System.out.println("wednesday");
}
else if( day==4){
System.out.println("thursday");
} 
elseif(day==5){
System.out.println("friday");
}
else if( day==6){
System.out.println("saturday");
}
else if(day==7){
System.out.println("sunday");
}
else{
System.out.println("Wrong Input");
}

sc.close();
}
}

