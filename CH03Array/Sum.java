public class Sum{
	public static void main(String[] args){
	int [] arr={4,8,12,15,7,9};
	int i=0;
	int sum=0;
	float avg =0f;
	while(i<6){
		sum=arr[i]+sum;
		i++;
	}
	avg= (float)sum/6;
	System.out.println(sum);
	System.out.println(avg);
	}
}