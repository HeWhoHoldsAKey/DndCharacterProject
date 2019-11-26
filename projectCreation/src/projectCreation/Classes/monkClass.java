package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class monkClass extends characterClass {
	public monkClass() {

		setCharClass("Monk");
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
		if ((dex + inte) >= 25) {
			weaponDecided = "Shortsword"; // 1d6
		} else if ((dex + wis) >= 25) {
			weaponDecided = "Unarmed";// 1d4"
		} else {
			weaponDecided = "Dual Wielding Daggers";// 2d4
		}
		return weaponDecided;
	}
}
