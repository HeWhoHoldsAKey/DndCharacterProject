package projectCreation;

public abstract class characterMain {
	String charClass;
	String name;
	String weaponOfChoice;
	String diceOfWeapon;
	String diceOfCharacter;
	String race;
	String subRace;
	String raceASIType;
	String subRaceASIType;

	int dex;
	int con;
	int str;
	int wis;
	int inte;
	int cha;
	int raceAsi;
	int SubRaceASI;

	public void setName(String name) {
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void printInfo() {
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: "
				+ wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + charClass + "  |  Hit point dice: " + diceOfCharacter + "  |  Prefered Weapon: "
				+ weaponOfChoice);

	}
}
