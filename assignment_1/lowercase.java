import java.util.*;

public class lowercase{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
 
char ch = sc.next().charAt(0);

if(ch>='a' && ch<='z'){
System.out.println("In Lowercase");
}
else{
System.out.println("Not In Lowercase");
}
sc.close();
}
}

