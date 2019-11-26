package projectCreation;

public class characterMain {
	private String charClass;
	private String name;
	private String weaponOfChoice;
	private String diceOfWeapon;
	private String diceOfCharacter;
	private String race;
	private String subRace;
	private String raceAsiType;
	private String subRaceAsiType;

	private int dex;
	private int con;
	private int str;
	private int wis;
	private int inte;
	private int cha;
	private int raceAsi;
	private int SubRaceAsi;

	public void setClass(characterClass classType) {
		this.dex = classType.getDex();
		this.con = classType.getCon();
		this.str = classType.getStr();
		this.wis = classType.getWis();
		this.inte = classType.getInte();
		this.cha = classType.getCha();
		this.charClass = classType.getCharClass();
		this.diceOfCharacter = classType.getdiceOfCharacter();
		this.weaponOfChoice = classType.getWeaponOfChoice();
	}

	public void setName(String val) {
		this.name = val;
	}

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

	public void setDiceOfWeapon(String newdice) {
		this.diceOfWeapon = newdice;
	}

	public void setRaceAsi(int val) {
		this.raceAsi = val;
	}

	public void setSubRaceAsi(int val) {
		this.SubRaceAsi = val;
	}

	public String getdiceOfWeapon() {
		return diceOfWeapon;
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
