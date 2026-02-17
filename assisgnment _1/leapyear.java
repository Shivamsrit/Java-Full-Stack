import java.util.*;

public class leapyear{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
int year= sc.nextInt();

String leap= "";

if(year%4==0 && year%100!=0){
      leap ="this is leap year";
}
else if(year%400==0){
        leap ="this is a leap year";
}
else{
leap="this is not a leap year";
}

System.out.println(leap);

sc.close();
}

}