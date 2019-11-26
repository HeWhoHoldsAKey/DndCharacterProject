package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class paladinClass extends characterClass {
	public paladinClass() {

		setCharClass("Paladin");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(),
				setCharacterClass.getCha()));

		setDex(setCharacterClass.getDex());
		setCon(setCharacterClass.getCon());
		setStr(setCharacterClass.getStr());
		setWis(setCharacterClass.getWis());
		setInte(setCharacterClass.getInte());
		setCha(setCharacterClass.getCha());

		setDiceOfCharacter("D10");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int cha) {
		String weaponDecided;
		if ((cha + str) >= 25) {
			weaponDecided = "Martial";
		} else {
			weaponDecided = "Simple";
		}
		return weaponDecided;
	}
}
