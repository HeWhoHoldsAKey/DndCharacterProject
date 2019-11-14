package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class druidClass extends characterClass {
	public druidClass() {

		setName("undetermened");
		setCharClass("Druid");
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
		if ((dex + wis) >= 25) {
			weaponDecided = "Dual Wielding Simple";
		} else {
			weaponDecided = "Scimitar"; // 1d6
		}
		return weaponDecided;
	}
}
