import java.util.Scanner;
public class Runners {

	public static void main(String[] args) 
	{
	greetCyclist();
	whereTo();
	}
		
	public static void greetCyclist()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("Hello fellow cyclist. What is your name?");
		String name=userInput.nextLine();
		System.out.println("Hello, "+name+". You have been given $5,000 by the bike gods. Use it to buy all the parts needed for a complete bike!");
		System.out.println("The parts needed for a complete bike include wheels, frame, clothing, brakes and the gear sprockets");
		System.out.println("In order to begin competing in races, you need to first buy all the parts for a complete bike");
		}
	
	public static void whereTo()
		{
		System.out.println("To visit the bike shop, type (1)");
		System.out.println("To check on your complete bike, type (2)");
		System.out.println("To begin racing, type (3)");
		Scanner userInput=new Scanner(System.in);
		int choice=userInput.nextInt();
		
		if (choice==1)//takes cyclist to bike shop
			{
			bikeShop();
			}
		else if (choice==2)//takes cyclist to garage
			{
			Garage();
			}
		else if (choice==3)//takes cyclist to race
			{
			raceCourse();
			}
		}

}
