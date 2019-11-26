package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.setCharacterClass;

public class rogueClass extends characterClass {

	public rogueClass() {

		setCharClass("Rogue");
		setWeaponOfChoice(decideWeapon(setCharacterClass.getDex(), setCharacterClass.getInte(), setCharacterClass.getStr(), setCharacterClass.getWis(), setCharacterClass.getCon()));

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
			weaponDecided = "Rapier";//1D6
		} else if ((dex + str) >= 25) {
			weaponDecided = "Shortsword";//1D6
		} else if ((dex + wis) >= 25) {
			weaponDecided = "Shortbow";//1D6
		} else if ((dex + con) >= 25) {
			weaponDecided = "Dual Wielding Shortswords";//2D6
		} else {
			weaponDecided = "Dual Wielding Daggers";//2D4
		}
		return weaponDecided;
	}
}
