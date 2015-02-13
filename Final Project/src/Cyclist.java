import java.util.Scanner;
public class Cyclist {
static String name;

	public static void main(String[] args) 
	{
	explain();
	whereTo();
	}
		
	public static void explain()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("Welcome fellow cyclist. What is your name?");
		name=userInput.nextLine();
		System.out.println("Hello, " + name + ". Thanks for playing!");
		System.out.println("The first thing you need to do is buy all the parts for a complete bike.");
		System.out.println("You have been given an initial $5,000 to buy bike parts.");
		System.out.println("The parts needed for a complete bike include a frame, wheels, handlebars and a seat post.");
		System.out.println("To see your current bike and your current balance, go to your portfolio.");
		}
	
	public static void whereTo()
		{
		System.out.println();
		System.out.println("MAIN MENU");
		System.out.println("To visit the bike shop, type (1).");
		System.out.println("To see your portfolio, type (2).");
		Scanner userInput=new Scanner(System.in);
		int choice=userInput.nextInt();
		Player.setUpArray();
		if (choice==1)
			{	
			bikeShop.welcome();
			bikeShop.Giant();
			bikeShop.buyParts();
			}
		else if (choice==2)
			{
			Player.welcome();
			Player.ask();
			}
		}
	}