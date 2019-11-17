package projectCreation;

public abstract class characterMain {
	String charClass;
	String name;
	String weaponOfChoice;
	String diceOfWeapon;
	String diceOfCharacter;
	String race;
	String subRace;
	String raceAsiType;
	String subRaceAsiType;

	int dex;
	int con;
	int str;
	int wis;
	int inte;
	int cha;
	int raceAsi;
	int SubRaceAsi;

	public void setRace(String val) {
		this.race = val;
	}

	public void setSubRace(String val) {
		this.subRace = val;
	}

	public void setRaceAsiType(String val) {
		this.raceAsiType = val;
	}

	public void setSubRaceAsiType(String val) {
		this.subRaceAsiType = val;
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

	public void setName(String val) {
		this.name = val;
	}

	public void setRaceAsi(int val) {
		this.raceAsi = val;
	}

	public void setSubRaceAsi(int val) {
		this.SubRaceAsi = val;
	}

	public void setDex(int val) {
		this.dex = val;
	}

	public void setCon(int val) {
		this.con = val;
	}

	public void setStr(int val) {
		this.str = val;
	}

	public void setWis(int val) {
		this.wis = val;
	}

	public void setInte(int val) {
		this.inte = val;
	}

	public void setCha(int val) {
		this.cha = val;
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

	public String getName() {
		return name;
	}

	public String getRace() {
		return race;
	}

	public String getSubRace() {
		return subRace;
	}

	public String getRaceAsiType() {
		return raceAsiType;
	}

	public String getSubRaceAsiType() {
		return subRaceAsiType;
	}

	public void printInfo() {
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: "
				+ wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + charClass + "  |  Hit point dice: " + diceOfCharacter + "  |  Prefered Weapon: "
				+ weaponOfChoice);

	}
}
