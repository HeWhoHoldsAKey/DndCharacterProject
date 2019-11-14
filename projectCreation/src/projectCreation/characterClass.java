package projectCreation;

public abstract class characterClass {
	private String charClass;
	private String name;
	private String weaponOfChoice;
	private String diceOfWeapon;
	private String diceOfCharacter;

	int dex;
	int con;
	int str;
	int wis;
	int inte;
	int cha;

	public String getName() {
		return name;
	}

	public String getCharClass() {
		return charClass;
	}

	public String getWeaponOfChoice() {
		return weaponOfChoice;
	}

	public String getdiceOfWeapon() {
		return diceOfWeapon;
	}

	public String getdiceOfCharacter() {
		return diceOfCharacter;
	}

	public int getDex() {
		return dex;
	}

	public int getCon() {
		return con;
	}

	public int getStr() {
		return str;
	}

	public int getWis() {
		return wis;
	}

	public int getInte() {
		return inte;
	}

	public int getCha() {
		return cha;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setCharClass(String newClass) {
		this.charClass = newClass;
	}

	public void setWeaponOfChoice(String newWeapon) {
		this.weaponOfChoice = newWeapon;
	}

	public void setDiceOfWeapon(String newdice) {
		this.diceOfWeapon = newdice;
	}

	public void setDiceOfCharacter(String newdice) {
		this.diceOfCharacter = newdice;
	}

	public void setDex(int newVal) {
		this.dex = newVal;
	}

	public void setCon(int newVal) {
		this.con = newVal;
	}

	public void setStr(int newVal) {
		this.str = newVal;
	}

	public void setWis(int newVal) {
		this.wis = newVal;
	}

	public void setInte(int newVal) {
		this.inte = newVal;
	}

	public void setCha(int newVal) {
		this.cha = newVal;
	}

	public void printInfo() {
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: "
				+ wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + charClass + "  |  Hit point dice: " + diceOfCharacter + "  |  Prefered Weapon: " + weaponOfChoice);

	}

}
