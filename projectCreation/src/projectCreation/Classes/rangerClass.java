package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class rangerClass extends characterClass {

	public rangerClass() {

		setCharClass("Ranger");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(),
				setCharacterClass.getCon()));

		setDex(setCharacterClass.getDex());
		setCon(setCharacterClass.getCon());
		setStr(setCharacterClass.getStr());
		setWis(setCharacterClass.getWis());
		setInte(setCharacterClass.getInte());
		setCha(setCharacterClass.getCha());

		setDiceOfCharacter("D10");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int con) {
		String weaponDecided;
		if ((dex + str) >= 25) {
			weaponDecided = "Dual Wielding Shortsword";// 2d6
		} else if ((dex + wis) >= 25) {
			weaponDecided = "Dual Simple";
		} else {
			weaponDecided = "Longbow"; // 1d8
		}
		return weaponDecided;
	}

}
