import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Inventory {
	private int maxLoad;
	private Map<Item,Integer> inventory;

	public Inventory(int carryWeight) {
		setMaxLoad(carryWeight);
		setMapInventory();
	}

	public int getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	public Map<Item,Integer> getMapInventory() {
		return inventory;
	}

	public void setMapInventory() {
		this.inventory = new HashMap<Item,Integer>();
	}

	/**
	* Adds an Item object into the inventory. Will determine whether or not the
	* Item object already exists. If it does, then it will append the amount added.
	* Overall the weight of the item to be added along with the current weight of the
	* inventory cannot be more than the maxLoad. An exit code of 0 is successful, while
	* an exit code of -1 is not.
	*
	* @param item Item object to be added.
	* @param quantity The number of items to be added.
	* @return An exit code to determine whether adding was successful or not.
	*/
	public int addItem(Item item, int quantity) {
		int weightToBeAdded = item.getWeight() * quantity;
		if((getWeight() + weightToBeAdded) <= maxLoad) {
			if(inventory.containsKey(item)) {
				// add more to existing item
				System.out.println(item.getName() + " already exists... adding on");
				inventory.replace(item, inventory.get(item)+quantity);
			} else {
				inventory.put(item, quantity);
			}
			return 0;
		} else {
			return -1;
		}
	}

	/**
	* Removes quantity specified of Item object from the inventory if
	* quantity is less than current quantity in inventory. Otherwise
	* removes entire Item object from inventory.
	*
	* @param item The Item object that you want to manipulate
	* @param quantity The quantity you want to remove
	*/
	public void removeItem(Item item, int quantity) {
		if(item != null) {
			if(quantity >= inventory.get(item)) {
				inventory.remove(item);
			} else {
				inventory.replace(item, inventory.get(item)-quantity);
			}
		}
	}

	/**
	* Iterates through entire inventory and determines the weight of one
	* Item object multiplied by the quantity of that Item in the inventory.
	*
	* @return The weight of the entire inventory.
	*/
	public int getWeight() {
		int weight = 0;
		Item item = null;
		Set<Item> items = inventory.keySet();
		Iterator<Item> itr = items.iterator();
		while(itr.hasNext()) {
			item = itr.next();
			weight += item.getWeight() * inventory.get(item);
		}
		return weight;
	}

	/**
	* Gets an Item object from the inventory by item name. If item cannot
	* be found will throw an Exception.
	*
	* @param itemName The name of the Item object.
	* @return The Item object or null if not found.
	* @throws Exception Item was not found in inventory.
	*/
	public Item getItem(String itemName) throws Exception {
		Set<Item> items = inventory.keySet();
		Item item = null;
		boolean found = false;
		Iterator<Item> itr = items.iterator();
		while(itr.hasNext() && !found) {
			item = itr.next();
			if(item.getName().equals(itemName)) {
				found = true;
			}
		}
		if(!found) {
			item = null;
			throw new Exception("Item was not found in inventory");
		}
		return item;
	}

	/**
	* Gets the quantity of the item in the inventory. Will throw an
	* exception if item cannot be found.
	*
	* @param itemName Name of the item.
	* @return The quantity of the item in the inventory.
	*/
	public int getQuantity(String itemName) {
		int quantity = 0;

		Item item;
		try {
			item = getItem(itemName);
			if(item != null) {
				quantity = inventory.get(item);
			}
		} catch (Exception e) {
			System.out.println(itemName + " cannot be found in the inventory.");
		}

		return quantity;
	}
}