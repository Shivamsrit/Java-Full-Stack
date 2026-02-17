import java.util.*;

public class count{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int i=0;
      		while(no>0){
			no=no/10;
			i++;
		}
		System.out.println(" count is = "+i);
		sc.close();
	}
}