public class Item {
	private String name;
	private int weight;
	private int value;

	public Item(String itemName, int weight, int value) {
		setName(itemName);
		setWeight(weight);
		setValue(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}