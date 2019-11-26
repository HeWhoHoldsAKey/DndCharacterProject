package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class druidClass extends characterClass {
	public druidClass() {

		setCharClass("Druid");
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
		if ((dex + wis) >= 25) {
			weaponDecided = "Dual Wielding Simple";
		} else {
			weaponDecided = "Scimitar"; // 1d6
		}
		return weaponDecided;
	}
}
