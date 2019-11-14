package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class bardClass extends characterClass {
	public bardClass() {

		setName("undetermened");
		setCharClass("Bard");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(),
				makeStats.getCha()));

		setDex(makeStats.getDex());
		setCon(makeStats.getCon());
		setStr(makeStats.getStr());
		setWis(makeStats.getWis());
		setInte(makeStats.getInte());
		setCha(makeStats.getCha());

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
