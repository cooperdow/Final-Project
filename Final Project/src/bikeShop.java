import java.util.ArrayList;
import java.util.Scanner;
public class bikeShop {
private String part;
private int cost;
static ArrayList<bikeShop>giant=new ArrayList<bikeShop>();

	public bikeShop(String pa, int co)
		{
		part=pa;
		cost=co;
		}
	
	public static void welcome()
	{
	System.out.println();
	System.out.println("BIKE SHOP");
	System.out.println("Welcome to the bike shop " + Cyclist.name + ".");
	System.out.println("Only buy one of each part please.");
	System.out.println();
	}
	
	public static void Giant()
	{
	giant.add(new bikeShop("TCR Advanced Pro 1 Frame", 3000));
	giant.add(new bikeShop("Propel Advanced O Frame", 4000));
	giant.add(new bikeShop("P-TRX1 27.5 Alloy Trail Wheel System", 500));
	giant.add(new bikeShop("P-TRX1 27.5 Carbon Trail Wheel System", 700));
	giant.add(new bikeShop("Contact Road Handlebars", 95));
	giant.add(new bikeShop("Contact SLR Aero Road Handlebars", 260));
	giant.add(new bikeShop("Contact SLR Seatpost", 150));
	giant.add(new bikeShop("Contact Switch Seatpost", 280));
	}
	
	public static void buyParts()
	{
	System.out.println("To buy a frame, type (1)."); 
	System.out.println("To buy wheels, type (2).");
	System.out.println("To buy handlebars, type (3).");
	System.out.println("To buy a seatpost, type (4).");
	System.out.println("To finish shopping, type (5).");
	Scanner userInput=new Scanner(System.in);
	int choosePart=userInput.nextInt();
	if (choosePart==1)
		{
		System.out.println("Which frame would you like to buy?");
		System.out.println("(1)" + giant.get(0).getPart() + ": $" + giant.get(0).getCost());
		System.out.println("(2)" + giant.get(1).getPart() + ": $" + giant.get(1).getCost());
		System.out.println("(3) cancel");
		int purchase=userInput.nextInt();
			if (purchase==1)
				{
				if (((Player) Player.money.get(0)).getWallet()<3000)
					{
					System.out.println("---------------------");
					System.out.println("You don't have enough money to buy this!");
					System.out.println("Choose something else to buy.");
					System.out.println("---------------------");
					buyParts();
					}			
				else 
					{
					Player.completeBike.add(giant.get(0).getPart());					
					((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-3000);
					System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
					System.out.println("---------------------");
					}
				}
			else if (purchase==2)
				{
				if (((Player) Player.money.get(0)).getWallet()<4000)
					{
					System.out.println("---------------------");
					System.out.println("You don't have enough money to buy this!");
					System.out.println("Choose something else to buy.");
					System.out.println("---------------------");
					buyParts();
					}
				else
					{
					Player.completeBike.add(giant.get(1).getPart());
					((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-4000);
					System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
					System.out.println("---------------------");
					}
				}
			else if (purchase==3)
				{
				buyParts();
				}
			buyParts();
			}
	
	else if (choosePart==2)
		{
		System.out.println("Which wheel system would you like to buy?");
		System.out.println("(1)" + giant.get(2).getPart() + ": $" + giant.get(2).getCost());
		System.out.println("(2)" + giant.get(3).getPart() + ": $" + giant.get(3).getCost());
		System.out.println("(3) cancel");
		int purchase=userInput.nextInt();
			if (purchase==1)
				{
				if (((Player) Player.money.get(0)).getWallet()<500)
					{
					System.out.println("---------------------");
					System.out.println("You don't have enough money to buy this!");
					System.out.println("Choose something else to buy.");
					System.out.println("---------------------");
					buyParts();
					}
				else
					{
					Player.completeBike.add(giant.get(2).getPart());
					((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-500);
					System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
					System.out.println("---------------------");
					}
				}
			else if (purchase==2)
				{
				if (((Player) Player.money.get(0)).getWallet()<700)
					{
					System.out.println("---------------------");
					System.out.println("You don't have enough money to buy this!");
					System.out.println("Choose something else to buy.");
					System.out.println("---------------------");
					buyParts();
					}
				else
					{
					Player.completeBike.add(giant.get(3).getPart());
					((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-700);
					System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
					System.out.println("---------------------");
					}
				}
			else if (purchase==3)
				{
				buyParts();
				}
			buyParts();
			}
	
	else if (choosePart==3)
		{
		System.out.println("Which handlebar would you like to buy?");
		System.out.println("(1)" + giant.get(4).getPart() + ": $" + giant.get(4).getCost());
		System.out.println("(2)" + giant.get(5).getPart() + ": $" + giant.get(5).getCost());
		System.out.println("(3) cancel");
		int purchase=userInput.nextInt();
			if (purchase==1)
				{
				if (((Player) Player.money.get(0)).getWallet()<95)
					{
					System.out.println("---------------------");
					System.out.println("You don't have enough money to buy this!");
					System.out.println("Choose something else to buy.");
					System.out.println("---------------------");
					buyParts();
					}
				else
					{
					Player.completeBike.add(giant.get(4).getPart());
					((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-95);
					System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
					System.out.println("---------------------");
					}
				}
			else if (purchase==2)
				{
				if (((Player) Player.money.get(0)).getWallet()<260)
					{
					System.out.println("---------------------");
					System.out.println("You don't have enough money to buy this!");
					System.out.println("Choose something else to buy.");
					System.out.println("---------------------");
					buyParts();
					}
				else
					{
					Player.completeBike.add(giant.get(5).getPart());
					((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-260);
					System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
					System.out.println("---------------------");
					}
				}
			else if (purchase==3)
				{
				buyParts();
				}
		buyParts();
		}
	else if (choosePart==4)
		{
		System.out.println("Which seatpost would you like to buy?");
		System.out.println("(1)" + giant.get(6).getPart() + ": $" + giant.get(6).getCost());
		System.out.println("(2)" + giant.get(7).getPart() + ": $" + giant.get(7).getCost());
		System.out.println("(3) cancel");
		int purchase=userInput.nextInt();
			if (purchase==1)
				{
				if (((Player) Player.money.get(0)).getWallet()<150)
					{
					System.out.println("---------------------");
					System.out.println("You don't have enough money to buy this!");
					System.out.println("Choose something else to buy.");
					System.out.println("---------------------");
					buyParts();
					}
				else
					{
					Player.completeBike.add(giant.get(6).getPart());
					((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-150);
					System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
					System.out.println("---------------------");
					}
				}
		else if (purchase==2)
			{
			if (((Player) Player.money.get(0)).getWallet()<280)
				{
				System.out.println("---------------------");
				System.out.println("You don't have enough money to buy this!");
				System.out.println("Choose something else to buy.");
				System.out.println("---------------------");
				buyParts();
				}
			else
				{
				Player.completeBike.add(giant.get(7).getPart());
				((Player) Player.money.get(0)).setWallet(((Player) Player.money.get(0)).getWallet()-280);
				System.out.println("Your current balance is: $" + ((Player) Player.money.get(0)).getWallet());
				System.out.println("---------------------");
				}
			}
		else if (purchase==3)
			{
			buyParts();
			}
		buyParts();
		}

	else if (choosePart==5)
		{
		System.out.println("---------------------");
		System.out.println("Thanks for shopping!");
		System.out.println("To return to the main menu, type (1).");
		Scanner uzerInput=new Scanner(System.in);
		int choice=uzerInput.nextInt();		
			if (choice==1)
				{
				Cyclist.whereTo();
				}
			}
		}
	
	public String getPart() 
	{
		return part;
	}

	public void setPart(String part) 
	{
		this.part = part;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost) 
	{
		this.cost = cost;
	}
}