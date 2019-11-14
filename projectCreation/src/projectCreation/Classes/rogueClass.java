package projectCreation.Classes;

import projectCreation.characterClass;
import projectCreation.makeStats;

public class rogueClass extends characterClass {

	public rogueClass() {

		setName("undetermened");
		setCharClass("Rogue");
		setWeaponOfChoice(decideWeapon(makeStats.getDex(), makeStats.getInte(), makeStats.getStr(), makeStats.getWis(), makeStats.getCon()));

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
			weaponDecided = "Rapier";//1D6
		} else if ((dex + str) >= 25) {
			weaponDecided = "Shortsword";//1D6
		} else if ((dex + wis) >= 25) {
			weaponDecided = "Shortbow";//1D6
		} else if ((dex + con) >= 25) {
			weaponDecided = "Dual Wielding Shortswords";//2D6
		} else {
			weaponDecided = "Dual Wielding Daggers";//2D4
		}
		return weaponDecided;
	}
}
