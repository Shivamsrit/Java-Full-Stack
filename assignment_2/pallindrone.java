import java.util.*;

public class pallindrone{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int reverse=0;
		int temp1 =no;
      		while(no>0){
			int temp = no%10;
			no=no/10;
			reverse= reverse*10+temp;
			
		}
               if(reverse == temp1){
		System.out.println(" no is pallindrone");
		}
		else{
		System.out.println(" no is not pallindrone");
		}
		sc.close();
	}
}