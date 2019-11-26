package projectCreation;

import projectCreation.Classes.*;

public class setCharacterClass {
	static int minNum = 3;
	static int maxNum = 18;
	
	static int dex = getRandomNum(minNum, maxNum);
	static int con = getRandomNum(minNum, maxNum);
	static int str = getRandomNum(minNum, maxNum);
	static int wis = getRandomNum(minNum, maxNum);
	static int inte = getRandomNum(minNum, maxNum);
	static int cha = getRandomNum(minNum, maxNum);

	public static characterClass createCharacterClass(int dex, int con, int str, int wis, int inte, int cha) {
		if (dex >= 15) {

			if (inte > con) {
				return new rogueClass();
			} else {
				return new monkClass();// "Monk";
			}
		} else if (str >= 15) {
			return new barbarianClass();// "Barbarian";
		} else if (wis >= 15) {

			if ((wis + dex) >= 25) {
				return new rangerClass();// "Ranger";
			} else if ((wis + con) >= 25) {
				return new clericClass();// "Cleric";
			} else {
				return new druidClass();// "Druid";
			}
		} else if (inte >= 15) {
			return new wizardClass();// "Wizard";
		} else if (cha >= 15) {

			if ((cha + dex) >= 25) {
				return new bardClass();// "Bard";
			} else if ((cha + wis) >= 25) {
				return new warlockClass();// "Warlock";
			} else if ((cha + con) >= 25) {
				return new paladinClass();// "Paladin";
			} else {
				return new sorcererClass();// "Sorcerer";
			}
		} else {
			return new fighterClass();// "Fighter";
		}

	}
	
	public static int getDex() {
		return getRandomNum(minNum, maxNum);
	}

	public static int getCon() {
		return getRandomNum(minNum, maxNum);
	}

	public static int getStr() {
		return getRandomNum(minNum, maxNum);
	}

	public static int getWis() {
		return getRandomNum(minNum, maxNum);
	}

	public static int getInte() {
		return getRandomNum(minNum, maxNum);
	}

	public static int getCha() {
		return getRandomNum(minNum, maxNum);
	}

	public static int getRandomNum(int min, int max) {
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}
}
