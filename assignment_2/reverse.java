import java.util.*;

public class reverse{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int reverse=0;
		
      		while(no>0){
			int temp = no%10;
			no=no/10;
			reverse = reverse*10+temp;
			
		}
		System.out.println(" reverse digit is = "+sum);
		sc.close();
	}
}