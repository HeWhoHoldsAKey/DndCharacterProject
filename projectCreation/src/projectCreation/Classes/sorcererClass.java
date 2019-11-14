package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class sorcererClass extends characterClass {
	public sorcererClass() {

		setName("undetermened");
		setCharClass("Sorcerer");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(),
				makeStats.getCha()));

		setDex(makeStats.getDex());
		setCon(makeStats.getCon());
		setStr(makeStats.getStr());
		setWis(makeStats.getWis());
		setInte(makeStats.getInte());
		setCha(makeStats.getCha());

		setDiceOfCharacter("D6");
	}

	private String decideWeapon(int dex, int inte, int str, int wis, int cha) {
		String weaponDecided;
		if ((dex + inte) >= 25) {
			weaponDecided = "Light Crossbow";// 1d8S
		} else {
			weaponDecided = "Dagger";// 1d4
		}
		return weaponDecided;
	}
}
