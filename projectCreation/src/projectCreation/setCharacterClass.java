package projectCreation;

import projectCreation.Classes.*;

public class setCharacterClass {

	public static characterClass createCharacterClass(int dex, int con, int str, int wis, int inte, int cha) {
		if (dex >= 15) {

			if (inte > con) {
				return new rogueClass();
			} else {
				return new monkClass();//"Monk";
			}
		} else if (str >= 15) {
			return new barbarianClass();//"Barbarian";
		} else if (wis >= 15) {

			if ((wis + dex) >= 25) {
				return new rangerClass();//"Ranger";
			} else if ((wis + con) >= 25) {
				return new clericClass();//"Cleric";
			} else {
				return new druidClass();//"Druid";
			}
		} else if (inte >= 15) {
			return new wizardClass();//"Wizard";
		} else if (cha >= 15) {

			if ((cha + dex) >= 25) {
				return new bardClass();//"Bard";
			} else if ((cha + wis) >= 25) {
				return new warlockClass();//"Warlock";
			} else if ((cha + con) >= 25) {
				return new paladinClass();//"Paladin";
			} else {
				return new sorcererClass();//"Sorcerer";
			}
		} else {
			return new fighterClass();//"Fighter";
		}
	}
}
