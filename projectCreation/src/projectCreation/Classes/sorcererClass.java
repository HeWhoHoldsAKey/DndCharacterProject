package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class sorcererClass extends characterClass {
	public sorcererClass() {

		setCharClass("Sorcerer");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(),
				setCharacterClass.getCha()));

		setDex(setCharacterClass.getDex());
		setCon(setCharacterClass.getCon());
		setStr(setCharacterClass.getStr());
		setWis(setCharacterClass.getWis());
		setInte(setCharacterClass.getInte());
		setCha(setCharacterClass.getCha());

		setDiceOfCharacter("D6");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int cha) {
		String weaponDecided;
		if ((dex + inte) >= 25) {
			weaponDecided = "Light Crossbow";// 1d8S
		} else {
			weaponDecided = "Dagger";// 1d4
		}
		return weaponDecided;
	}
}
