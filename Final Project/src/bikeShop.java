import java.util.ArrayList;
public class bikeShop {
private String part;
private int cost;

	public bikeShop(String pa, int co)
		{
		part=pa;
		cost=co;
		}

	public static void main(String[] args) 
		{	
		welcome();
		}

	public static void welcome()
		{
		System.out.println("Welcome to the bike shop");
		System.out.println("If you want to buy a frame, type (1)"); 
		System.out.println("If you want to buy wheels, type (2)");
		System.out.println("If you want to buy a seatpost, type (3)");
		System.out.println("If you want to buy handle bars, type (4)"); 
		
		}
	
	public static void Giant()
	{
	ArrayList<bikeShop>giant=new ArrayList<bikeShop>();
	giant.add(new bikeShop("TCR Advanced Pro 1 Frame", 3000));
	giant.add(new bikeShop("P-TRX1 29er Alloy Trail Wheel System", 500));
	giant.add(new bikeShop("Contact Road Handlebars", 95));
	giant.add(new bikeShop("Contact Seatpost", 150));
	}
	
	
	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
