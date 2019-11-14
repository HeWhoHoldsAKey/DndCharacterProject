package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class paladinClass extends characterClass {
	public paladinClass() {

		setName("undetermened");
		setCharClass("Paladin");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(),
				makeStats.getCha()));

		setDex(makeStats.getDex());
		setCon(makeStats.getCon());
		setStr(makeStats.getStr());
		setWis(makeStats.getWis());
		setInte(makeStats.getInte());
		setCha(makeStats.getCha());

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
