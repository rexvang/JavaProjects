public class Player {
	private String name;
	private int age;
	private int speed;
	private int carryWeight;
	private int health;
	private Inventory inventory;

	public Player(String name, int age, int speed, int carryWeight, int health) {
		setName(name);
		setAge(age);
		setSpeed(speed);
		setCarryWeight(carryWeight);
		setHealth(health);
		setInventory(getCarryWeight());
	}

	public void carry(Item item, int quantity) {
		int status = inventory.addItem(item, quantity);
		if(status != 0) {
			// Over capacity
			System.out.println("Over capacity... drop items or pick up less items.");
		} else {
			System.out.println("Added " + item.getName());
		}
	}

	public void drop(Item item, int quantity) {
		inventory.removeItem(item, quantity);
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(int carryWeight) {
		this.inventory = new Inventory(carryWeight);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCarryWeight() {
		return carryWeight;
	}
	public void setCarryWeight(int carryWeight) {
		this.carryWeight = carryWeight;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}