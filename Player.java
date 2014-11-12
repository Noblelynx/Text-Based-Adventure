import java.util.Scanner;

public class Player {
	
	String username;
	int age, winCount, lossCount, drawCount;
	Scanner input = new Scanner(System.in);
	public Player(){
		
		//gets user name
		System.out.println("Enter a username");
		username = input.next();
		
		//gets user's age
		System.out.println("Enter your age");
		age = input.nextInt();
		
		winCount = 0;
		drawCount = 0;
		lossCount = 0;
		
	}
	//counts win
	public void win(){
		System.out.println("You won!!!");
		winCount++;
	}
	//counts loss
	public void lose(){
		System.out.println("You Lost....");
		lossCount++;
	}
	//counts the draw
	public void isDraw(){
		System.out.println("It is even");
		drawCount++;
	}
	//displays user information
  public void displayProfile(){
		System.out.println("Username: " + username + "\n Age:" + age);
		System.out.println("This player won: " + winCount + " time(s)");
		System.out.println("This player lost: " + lossCount + " time(s)");
		System.out.println("This player drew: " + drawCount + " time(s)");
	}

}
