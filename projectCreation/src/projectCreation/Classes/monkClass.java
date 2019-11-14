package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class monkClass extends characterClass {
	public monkClass() {

		setName("undetermened");
		setCharClass("Monk");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(),
				makeStats.getCon()));

		setDex(makeStats.getDex());
		setCon(makeStats.getCon());
		setStr(makeStats.getStr());
		setWis(makeStats.getWis());
		setInte(makeStats.getInte());
		setCha(makeStats.getCha());

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
