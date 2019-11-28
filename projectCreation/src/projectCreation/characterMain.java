package projectCreation;

public class characterMain {
	private String charClass;
	private String name;
	private String weaponOfChoice;
	private String diceOfWeapon;
	private String diceOfCharacter;

	private int dex;
	private int con;
	private int str;
	private int wis;
	private int inte;
	private int cha;

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
	
	public void clearAll() {
		this.dex = 0;
		this.con = 0;
		this.str = 0;
		this.wis = 0;
		this.inte = 0;
		this.cha = 0;
		this.charClass = null;
		this.diceOfCharacter = null;
		this.weaponOfChoice = null;
	}

	public void setName(String val) {
		this.name = val;
	}

	public void setDiceOfWeapon(String newdice) {
		this.diceOfWeapon = newdice;
	}

	public String getdiceOfWeapon() {
		return diceOfWeapon;
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
