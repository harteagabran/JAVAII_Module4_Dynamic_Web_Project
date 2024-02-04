package model;

/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Feb 4, 2024
 */
public class StatMaker {
	private String name;
	private int strength;
	private int speed;
	private int defense;
	
	public StatMaker() {
		super();
	}
	
	public StatMaker(String name) {
		super();
		this.name = name;
		GenerateStats();
	}
	
	public StatMaker(String name, String str, String spd, String def) {
		super();
		this.name = name;
		this.strength = Integer.parseInt(str);
		this.speed = Integer.parseInt(spd);
		this.defense = Integer.parseInt(def);
	}

	/**
	 * 
	 */
	private void GenerateStats() {
		// TODO Auto-generated method stub
		final int MAX = 20;
		final int MIN = 1;
		for(int i = 0; i < 3; i++) {
			int num = (int)(Math.random() * (MAX - MIN) + MIN);
			
			switch (i) {
				case 0: setStrength(num);
					break;
				case 1: setSpeed(num);
					break;
				case 2: setDefense(num);
					break;
			}
				
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the strength
	 */
	public String getStrength() {
		return String.valueOf(this.strength);
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the speed
	 */
	public String getSpeed() {
		return String.valueOf(this.speed);
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the defense
	 */
	public String getDefense() {
		return String.valueOf(this.defense);
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
}
