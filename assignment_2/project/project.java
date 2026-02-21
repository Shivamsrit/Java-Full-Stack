import java.util.*;

public class project {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int userwin=0;
		int Swin=0;
		int draw =0;
		char ch='y';
		while(ch=='y'){
			System.out.println("Enter your choice");
			System.out.println("1. Stone");
			System.out.println("2. Paper");
			System.out.println("3. Scissor \n\n");
			System.out.print("Your choice : ");
			int choice=sc.nextInt();
			System.out.println("\n");
			if(choice>3){
				System.out.println("Wrong choice ! \n");
				continue;
			}

			
			int Schoice= (int)(Math.random()*3+1);
			System.out.println("System choice : "+Schoice);
			
			if(choice ==1 && Schoice ==3){
				userwin++;
				System.out.println("You win!");
			}
			else if(choice==1 && Schoice ==1){
				draw++;
				System.out.println("Draw !");
			}
			else if( choice ==3 && Schoice==2){
				userwin++;
				System.out.println("You win!");
			}
			else if(choice==3 && Schoice==3){
				draw++;
				System.out.println("Draw !");
			}
			else if(choice ==2 && Schoice==1){
			        userwin++;
				System.out.println("You win!");
			}
			else if(choice==2 && Schoice==2){
				draw++;
				System.out.println("Draw !");
			}
			else{
				Swin++;
				System.out.println("System win!");
			}
			System.out.println("\n\n");
			
			System.out.println("Do you want to play again(y/n)");
			ch=sc.next().charAt(0);

			System.out.println("\n\n");
		}	
		System.out.println("Game Over!\n");

		System.out.println("User Wins :"+userwin);
		System.out.println("System Wins :"+Swin);
		System.out.println("Draw :"+draw+"\n");
		if(userwin>Swin){
			System.out.println("Overall Winner : user");
		}
		else if(userwin == Swin){
		   	System.out.println("Tie match");
		}
		else{
			System.out.println("Overall Winner : System");
		}
		sc.close();
	}
}
										
				
			
