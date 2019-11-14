package projectCreation;

import java.util.Random;

public class characterClass {
	int minNum = 3;
	int maxNum = 18;

	// Proof of concept
	String characterName = "Dobby";

	int dex = getRandomNum(minNum, maxNum);
	int con = getRandomNum(minNum, maxNum);
	int str = getRandomNum(minNum, maxNum);
	int wis = getRandomNum(minNum, maxNum);
	int inte = getRandomNum(minNum, maxNum);
	int cha = getRandomNum(minNum, maxNum);

	String myClass = getCharacter(dex, con, str, wis, inte, cha);
	String myDice = getDice(myClass);
	String myWeapon = getWeapon(myClass);

	public void printInfo() {
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: "
				+ wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + myClass);
		System.out.println("Hit point dice: " + myDice);
		System.out.println("Prefered Weapon and Damage Dice: " + myWeapon);
	}

	public String getName() {
		return characterName;
	}

	public int getRandomNum(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}

	public String getCharacter(int dex, int con, int str, int wis, int inte, int cha) {
		String classDecided = "";

		if (dex >= 15) {

			if (inte > con) {
				classDecided = "Rogue";
			} else {
				classDecided = "Monk";
			}
		} else if (str >= 15) {
			classDecided = "Barbarian";
		} else if (wis >= 15) {

			if ((wis + dex) >= 25) {
				classDecided = "Ranger";
			} else if ((wis + con) >= 25) {
				classDecided = "Cleric";
			} else {
				classDecided = "Druid";
			}
		} else if (inte >= 15) {
			classDecided = "Wizard";
		} else if (cha >= 15) {

			if ((cha + dex) >= 25) {
				classDecided = "Bard";
			} else if ((cha + wis) >= 25) {
				classDecided = "Warlock";
			} else if ((cha + con) >= 25) {
				classDecided = "Paladin";
			} else {
				classDecided = "Sorcerer";
			}
		} else {
			classDecided = "Fighter";
		}
		return classDecided;
	}

	public String getDice(String myClass) {
		String diceDecided = "";

		switch (myClass) {
		case "Rogue":
			diceDecided = "d8";
			break;
		case "Monk":
			diceDecided = "d8";
			break;
		case "Barbarian":
			diceDecided = "d12";
			break;
		case "Ranger":
			diceDecided = "d10";
			break;
		case "Cleric":
			diceDecided = "d8";
			break;
		case "Druid":
			diceDecided = "d8";
			break;
		case "Wizard":
			diceDecided = "d6";
			break;
		case "Bard":
			diceDecided = "d8";
			break;
		case "Warlock":
			diceDecided = "d8";
			break;
		case "Paladin":
			diceDecided = "d10";
			break;
		case "Sorcerer":
			diceDecided = "D6";
		default:
			diceDecided = "d10";
		}
		return diceDecided;
	}

	public String getWeapon(String myClass) {
		String weaponDecided = "";

		switch (myClass) {
		case "Rogue":
			// rapier int, shortsword str, shortbow wis, dual wield shortsword con, daggers
			if ((dex + inte) >= 25) {
				weaponDecided = "Rapier, 1d6";
			} else if ((dex + str) >= 25) {
				weaponDecided = "Shortsword, 1d6";
			} else if ((dex + wis) >= 25) {
				weaponDecided = "Shortbow, 1d6";
			} else if ((dex + con) >= 25) {
				weaponDecided = "Dual Wielding Shortswords, 2d6";
			} else {
				weaponDecided = "Dual Wielding Daggers, 2d4";
			}
			break;
		case "Monk":
			// shortsword, simple weapon
			if ((dex + inte) >= 25) {
				weaponDecided = "Shortsword, 1d6";
			} else if ((dex + wis) >= 25) {
				weaponDecided = "Unarmed, 1d4";
			} else {
				weaponDecided = "Dual Wielding Daggers, 2d4";
			}
			break;
		case "Barbarian":
			// great axe, martial weapon, dual hand axe, simple weapon
			if ((str + con) >= 25) {
				weaponDecided = "Great Axe, ";// 1d12?
			} else if ((str + wis) >= 25) {
				weaponDecided = "Martial";
			} else if ((str + inte) >= 25) {
				weaponDecided = "Dual Wielding Hand Axes, 2d6";
			} else {
				weaponDecided = "Simple";
			}
			break;
		case "Ranger":
			// dual shortsword, dual simple, longbow
			if ((dex + str) >= 25) {
				weaponDecided = "Dual Wielding Shortsword, 2d6";
			} else if ((dex + wis) >= 25) {
				weaponDecided = "Dual Simple";
			} else {
				weaponDecided = "Longbow, 1d8";
			}
			break;
		case "Cleric":
			// Mace, warhammer, light crossbow, simple weapon
			if ((str + inte) >= 25) {
				weaponDecided = "Mace, 1d6";
			} else if ((str + con) >= 25) {
				weaponDecided = "Warhammer, 1d8";
			} else if ((str + dex) >= 25) {
				weaponDecided = "Light Crossbow, 1d8";
			} else {
				weaponDecided = "Simple";
			}
			break;
		case "Druid":
			// dual simple, scimitar
			if ((dex + wis) >= 25) {
				weaponDecided = "Dual Wielding Simple";
			} else {
				weaponDecided = "Scimitar, 1d6";
			}
			break;
		case "Wizard":
			// quarterstaff, dagger,
			if ((dex + inte) >= 25) {
				weaponDecided = "Quarterstaff, 1d6";
			} else {
				weaponDecided = "Dagger, 1d4";
			}
			break;
		case "Bard":
			// rapier, longsword, simple, dagger
			if ((dex + cha) >= 25) {
				weaponDecided = "Rapier, 1d6";
			} else if ((str + cha) >= 25) {
				weaponDecided = "Longsword, 1d8";
			} else if ((wis + inte) >= 25) {
				weaponDecided = "Simple";
			} else {
				weaponDecided = "Dagger, 1d4";
			}
			break;
		case "Warlock":
			// light crossbow, simple, dagger
			if ((dex + inte) >= 25) {
				weaponDecided = "Light Crossbow, 1d8";
			} else if ((dex + str) >= 25) {
				weaponDecided = "Simple";
			} else {
				weaponDecided = "Dagger, 1d4";
			}
			break;
		case "Paladin":
			// Martial weapons, simple
			if ((cha + str) >= 25) {
				weaponDecided = "Martial";
			} else {
				weaponDecided = "Simple";
			}
			break;
		case "Sorcerer":
			// light crossbow, dagger
			if ((dex + inte) >= 25) {
				weaponDecided = "Light Crossbow, 1d8";
			} else {
				weaponDecided = "Dagger, 1d4";
			}
			break;
		default:
			// martial weapon, light crossbow, dual handaxe
			if ((dex + inte) >= 25) {
				weaponDecided = "Martial";
			} else if ((dex + str) >= 25) {
				weaponDecided = "Light Crossbow, 1d8";
			} else {
				weaponDecided = "Dual Wielding Handaxes, 2d6";
			}
		}
		return weaponDecided;
	}
}
