public class Skill {
	private String name;
	private int points;

	public Skill (String name, int points) {
		setName(name);
		setPoints(points);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
}
