package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class barbarianClass extends characterClass {

	public barbarianClass() {

		setCharClass("Barbarian");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(),
				setCharacterClass.getCon()));

		setDex(setCharacterClass.getDex());
		setCon(setCharacterClass.getCon());
		setStr(setCharacterClass.getStr());
		setWis(setCharacterClass.getWis());
		setInte(setCharacterClass.getInte());
		setCha(setCharacterClass.getCha());

		setDiceOfCharacter("D12");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int con) {
		String weaponDecided;
		if ((str + con) >= 25) {
			weaponDecided = "Great Axe";// 1d12?
		} else if ((str + wis) >= 25) {
			weaponDecided = "Martial";
		} else if ((str + inte) >= 25) {
			weaponDecided = "Dual Wielding Hand Axes";// 2d6
		} else {
			weaponDecided = "Simple";
		}
		return weaponDecided;
	}
}
