package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class warlockClass extends characterClass {
	public warlockClass() {

		setName("undetermened");
		setCharClass("Warlock");
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
		if ((dex + inte) >= 25) {
			weaponDecided = "Light Crossbow"; // 1d8
		} else if ((dex + str) >= 25) {
			weaponDecided = "Simple";
		} else {
			weaponDecided = "Dagger"; // 1d4
		}
		return weaponDecided;
	}
}
