package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class fighterClass extends characterClass {

	public fighterClass() {

		setCharClass("Fighter");
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
		if ((dex + inte) >= 25) {
			weaponDecided = "Martial";
		} else if ((dex + str) >= 25) {
			weaponDecided = "Light Crossbow";// 1d8
		} else {
			weaponDecided = "Dual Wielding Handaxes";// 1d6
		}
		return weaponDecided;
	}

}
