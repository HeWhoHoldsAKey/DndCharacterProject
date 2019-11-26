package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class bardClass extends characterClass {
	public bardClass() {
		setCharClass("Bard");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(),
				setCharacterClass.getCha()));

		setDex(setCharacterClass.getDex());
		setCon(setCharacterClass.getCon());
		setStr(setCharacterClass.getStr());
		setWis(setCharacterClass.getWis());
		setInte(setCharacterClass.getInte());
		setCha(setCharacterClass.getCha());

		setDiceOfCharacter("D8");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int cha) {
		String weaponDecided;
		if ((dex + cha) >= 25) {
			weaponDecided = "Rapier";// 1d6
		} else if ((str + cha) >= 25) {
			weaponDecided = "Longsword";// 1d8
		} else if ((wis + inte) >= 25) {
			weaponDecided = "Simple";
		} else {
			weaponDecided = "Dagger";// 1d4
		}
		return weaponDecided;
	}
}
