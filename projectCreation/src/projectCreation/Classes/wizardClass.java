package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class wizardClass extends characterClass {
	public wizardClass() {

		setName("undetermened");
		setCharClass("Wizard");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(),
				makeStats.getCon()));

		setDex(makeStats.getDex());
		setCon(makeStats.getCon());
		setStr(makeStats.getStr());
		setWis(makeStats.getWis());
		setInte(makeStats.getInte());
		setCha(makeStats.getCha());

		setDiceOfCharacter("D6");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int con) {
		String weaponDecided;
		if ((dex + inte) >= 25) {
			weaponDecided = "Quarterstaff";// 1d6";
		} else {
			weaponDecided = "Dagger";// 1d4
		}
		return weaponDecided;
	}
}
