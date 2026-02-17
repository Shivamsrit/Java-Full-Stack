import java.util.*;

public class armstrong{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int sum=0;
		int temp=no;
		int temp1=no;
		int count =0;
      		while(temp>0){

			temp=temp/10;
			count++;
			System.out.println(count);
		}
		while(temp1>0){
			int temp3= temp1%10;
			temp1=temp1/10;

				int j=1;
				for(int i=1 ; i<count+1; i++){
			 	j = j*temp3;
				}

			sum=sum+j;
		}

			System.out.println(" no is armstrong"+sum);
		
               if(sum == no){
		System.out.println(" no is armstrong");
		}
		else{
		System.out.println(" no is not armstrong");
		}
		sc.close();
	}
}