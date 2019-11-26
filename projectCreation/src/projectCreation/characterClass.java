package projectCreation;

public class characterClass {
	private String classDescription;
	private String charClass;
	private String weaponOfChoice;
	private String diceOfCharacter;

	private int dex;
	private int con;
	private int str;
	private int wis;
	private int inte;
	private int cha;

	public String getCharClass() {
		return charClass;
	}

	public String getdiceOfCharacter() {
		return diceOfCharacter;
	}

	public String getWeaponOfChoice() {
		return weaponOfChoice;
	}

	public String getClassDescription() {
		return classDescription;
	}

	public void setDiceOfCharacter(String newdice) {
		this.diceOfCharacter = newdice;
	}

	public void setWeaponOfChoice(String newWeapon) {
		this.weaponOfChoice = newWeapon;
	}

	public void setCharClass(String newClass) {
		this.charClass = newClass;
	}

	public void setClassDescription(String val) {
		this.classDescription = val;
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
}
