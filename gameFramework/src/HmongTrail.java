import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HmongTrail {

	private Date startDate;
	//private static Item[] items = {new Item("Knife",1,2),new Item("Food",1,5),new Item("Gun",5,10),new Item("Pots/pans",2,1),new Item("Flashlight",1,5)};
	private static ArrayList<Item> items = new ArrayList<Item>();
	private MainPlayer mainPlayer;

	public HmongTrail(String playerName, int playerRole) {
		if(playerRole == 1) {
			mainPlayer = new MainPlayer(playerName, 30, 50, 20, 100);
		}
		initItems();
	}

	private void initItems() {
		items.add(new Item("Knife",1,1));
		items.add(new Item("Gun",5,10));
		items.add(new Item("Food",1,5));
		items.add(new Item("Flashlight",1,5));
		items.add(new Item("Bullet",1,1));
	}

	public String printMsg(String msg) {
		return msg;
	}

	/**
	* @return the startDate
	*/
	public Date getStartDate() {
		return startDate;
	}

	/**
	* @param startDate the startDate to set
	*/
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public static void main (String[] args) {
		HmongTrail game = new HmongTrail("Rex",1);
		String name = game.mainPlayer.getName();
		int age = game.mainPlayer.getAge();
		int carry = game.mainPlayer.getCarryWeight();
		int health = game.mainPlayer.getHealth();
		int speed = game.mainPlayer.getSpeed();

		System.out.println("Player Name: " + name);
		System.out.println("Player Age: " + age);
		System.out.println("Player carry limit: " + carry);
		System.out.println("Player Health: " + health);
		System.out.println("Player Speed: " + speed);
		System.out.println("Player Inventory max: " + game.mainPlayer.getInventory().getMaxLoad());

		System.out.println("\nAdding 15 food to inventory...");
		game.mainPlayer.carry(items.get(2), 15);
		try {
			System.out.println("Checking inventory: " + game.mainPlayer.getInventory().getItem("Food").getName() + " - " + game.mainPlayer.getInventory().getQuantity("Food"));
		} catch (Exception e) {
			System.out.println("Food cannot be found in inventory");
		}

		System.out.println("\nAdding 2 guns to inventory...");
		game.mainPlayer.carry(items.get(1), 2);
		try {
			System.out.println("Checking inventory: " + game.mainPlayer.getInventory().getItem("Gun").getName() + " - " + game.mainPlayer.getInventory().getQuantity("Gun"));
		} catch (Exception e) {
			System.out.println("Gun cannot be found in inventory");
		}

		System.out.println("\nDropping 5 food from inventory...");
		game.mainPlayer.drop(items.get(2), 5);
		try {
			System.out.println("Checking inventory: " + game.mainPlayer.getInventory().getItem("Food").getName() + " - " + game.mainPlayer.getInventory().getQuantity("Food"));
		} catch (Exception e) {
			System.out.println("Food cannot be found in inventory");
		}

		System.out.println("\nAdding 2 guns to inventory...");
		game.mainPlayer.carry(items.get(1), 2);
		try {
			System.out.println("Checking inventory: " + game.mainPlayer.getInventory().getItem("Gun").getName() + " - " + game.mainPlayer.getInventory().getQuantity("Gun"));
		} catch (Exception e) {
			System.out.println("Gun cannot be found in inventory");
		}

		System.out.println("Checking inventory...");
		Set<Entry<Item,Integer>> items = game.mainPlayer.getInventory().getMapInventory().entrySet();
		Iterator<Entry<Item, Integer>> itr = items.iterator();
		Entry<Item, Integer> ent = null;
		while (itr.hasNext()) {
			ent = itr.next();
			System.out.println(ent.getKey().getName() + " - " + ent.getValue());
		}
	}
}
