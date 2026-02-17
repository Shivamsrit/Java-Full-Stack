import java.util.*;

public class sumdigit{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int sum=0;
      		while(no>0){
			int temp = no%10;
			no=no/10;
			sum = sum+temp;
			
		}
		System.out.println(" sumdigit is = "+sum);
		sc.close();
	}
}