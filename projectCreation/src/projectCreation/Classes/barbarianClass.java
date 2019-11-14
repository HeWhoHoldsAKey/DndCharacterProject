package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class barbarianClass extends characterClass {

	public barbarianClass() {

		setName("undetermened");
		setCharClass("Barbarian");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(),
				makeStats.getCon()));

		setDex(makeStats.getDex());
		setCon(makeStats.getCon());
		setStr(makeStats.getStr());
		setWis(makeStats.getWis());
		setInte(makeStats.getInte());
		setCha(makeStats.getCha());

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
