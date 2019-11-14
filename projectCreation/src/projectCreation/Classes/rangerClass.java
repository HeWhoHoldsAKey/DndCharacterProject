package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class rangerClass extends characterClass {

	public rangerClass() {

		setName("undetermened");
		setCharClass("Ranger");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(),
				makeStats.getCon()));

		setDex(makeStats.getDex());
		setCon(makeStats.getCon());
		setStr(makeStats.getStr());
		setWis(makeStats.getWis());
		setInte(makeStats.getInte());
		setCha(makeStats.getCha());

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
