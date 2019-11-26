package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class wizardClass extends characterClass {
	public wizardClass() {

		setCharClass("Wizard");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(),
				setCharacterClass.getCon()));

		setDex(setCharacterClass.getDex());
		setCon(setCharacterClass.getCon());
		setStr(setCharacterClass.getStr());
		setWis(setCharacterClass.getWis());
		setInte(setCharacterClass.getInte());
		setCha(setCharacterClass.getCha());

		setDiceOfCharacter("D6");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int con) {
		String weaponDecided;
		if ((dex + inte) >= 25) {
			weaponDecided = "Quarterstaff";// 1d6";
		} else {
			weaponDecided = "Dagger";// 1d4
		}
		return weaponDecided;
	}
}
