package diane.jeu;

public class Player {
	private String name;
	private double health;
	private double attack;
	
	public Player(String name, double health, double attack) {
		this.name = name;
		this.health = health;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void damage(double damage) {
		this.health -= damage;
	}
	
	public void hide(double hide) {
		this.health -= hide;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}
	
}
