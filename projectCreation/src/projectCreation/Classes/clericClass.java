package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class clericClass extends characterClass {
	public clericClass() {

		setCharClass("Cleric");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(),
				setCharacterClass.getCon()));

		setDex(setCharacterClass.getDex());
		setCon(setCharacterClass.getCon());
		setStr(setCharacterClass.getStr());
		setWis(setCharacterClass.getWis());
		setInte(setCharacterClass.getInte());
		setCha(setCharacterClass.getCha());

		setDiceOfCharacter("D8");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int con) {
		String weaponDecided;
		if ((str + inte) >= 25) {
			weaponDecided = "Mace";// 1d6
		} else if ((str + con) >= 25) {
			weaponDecided = "Warhammer";// 1d8
		} else if ((str + dex) >= 25) {
			weaponDecided = "Light Crossbow";// 1d8
		} else {
			weaponDecided = "Simple";
		}
		return weaponDecided;
	}
}
