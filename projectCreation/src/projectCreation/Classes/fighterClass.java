package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class fighterClass extends characterClass {

	public fighterClass() {

		setName("undetermened");
		setCharClass("Fighter");
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
		if ((dex + inte) >= 25) {
			weaponDecided = "Martial";
		} else if ((dex + str) >= 25) {
			weaponDecided = "Light Crossbow";// 1d8
		} else {
			weaponDecided = "Dual Wielding Handaxes";// 1d6
		}
		return weaponDecided;
	}

}
