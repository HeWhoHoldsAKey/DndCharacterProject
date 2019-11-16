package projectCreation;

public class characterClass extends characterMain {
	String weaponOfChoice;
	String diceOfWeapon;
	String diceOfCharacter;
	String charClass;

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
}
