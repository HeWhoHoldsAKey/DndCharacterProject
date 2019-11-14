package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class clericClass extends characterClass {
	public clericClass() {

		setName("undetermened");
		setCharClass("Cleric");
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
		if ((str + inte) >= 25) {
			weaponDecided = "Mace";// 1d6
		} else if ((str + con) >= 25) {
			weaponDecided = "Warhammer";// 1d8
		} else if ((str + dex) >= 25) {
			weaponDecided = "Light Crossbow";// 1d8
		} else {
			weaponDecided = "Simple";
		}
		return weaponDecided;
	}
}
