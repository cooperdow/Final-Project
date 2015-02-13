import java.util.ArrayList;
import java.util.Scanner;
public class Player {
static int headsCounter=0;
static int tailsCounter=0;
private String name;
private int wallet;
static ArrayList money=new ArrayList();
static ArrayList<String> completeBike=new ArrayList<String>();

public Player (String nm, int wt)
{
name=nm;
wallet=wt;
}
	
	public static ArrayList setUpArray()
		{
		money.add(new Player("", 5000));
		return money;
		}
	
	public static void welcome()
		{
		System.out.println();
		System.out.println("PORTFOLIO");
		System.out.println("Welcome to your portfolio " + Cyclist.name + ".");
		}
	public static void ask()
		{
		System.out.println();
		System.out.println("If you want to see your current bike, type (1).");
		System.out.println("If you want to check your balance, type (2).");
		System.out.println("To return to the main menu, type (3).");
		Scanner userInput=new Scanner(System.in);
		int choice=userInput.nextInt();
		
		if (choice==1)
			{
			currentBike();
			ask();
			}
		
		else if (choice==2)
			{
			bank();
			ask();
			}
		else if (choice==3)
			{
			Cyclist.whereTo();
			}
		}
	
	public static void currentBike()
		{
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Current bike:");
		for (String s: completeBike)
			System.out.println(s);
		System.out.println("---------------------");
		}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public static void bank()
		{
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Your current balance is: $" + ((Player) money.get(0)).getWallet());
		System.out.println("---------------------");
		}
	}
