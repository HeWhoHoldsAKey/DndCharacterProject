package projectCreation;

import java.util.Scanner;

public class characterMain {
	private String charClass;
	private String name;
	private String weaponOfChoice;
	private String diceOfWeapon;
	private String diceOfCharacter;
	private String race;

	private int dex;
	private int con;
	private int str;
	private int wis;
	private int inte;
	private int cha;

	public void setClass(characterClass classType) {
		this.dex = classType.getDex();
		this.con = classType.getCon();
		this.str = classType.getStr();
		this.wis = classType.getWis();
		this.inte = classType.getInte();
		this.cha = classType.getCha();
		this.charClass = classType.getCharClass();
		this.diceOfCharacter = classType.getdiceOfCharacter();
		this.weaponOfChoice = classType.getWeaponOfChoice();
	}

	public void clearAll() {
		this.dex = 0;
		this.con = 0;
		this.str = 0;
		this.wis = 0;
		this.inte = 0;
		this.cha = 0;
		this.charClass = null;
		this.diceOfCharacter = null;
		this.weaponOfChoice = null;
		this.name = null;
		this.diceOfWeapon = null;
	}

	public void setRace(characterRace raceType) {
		this.race = raceType.getRace();
		switch (raceType.getRaceAsiType()) {
		case "Con":
			this.con = this.con + raceType.getRaceAsi();
			break;
		case "Dex":
			this.dex = this.dex + raceType.getRaceAsi();
			break;
		case "Str":
			this.str = this.str + raceType.getRaceAsi();
			break;
		case "Wis":
			this.wis = this.wis + raceType.getRaceAsi();
			break;
		case "Inte":
			this.inte = this.inte + raceType.getRaceAsi();
			break;
		case "Cha":
			this.cha = this.cha + raceType.getRaceAsi();
			break;
		case "All":
			this.con = this.con + raceType.getRaceAsi();
			this.dex = this.dex + raceType.getRaceAsi();
			this.str = this.str + raceType.getRaceAsi();
			this.wis = this.wis + raceType.getRaceAsi();
			this.inte = this.inte + raceType.getRaceAsi();
			this.cha = this.cha + raceType.getRaceAsi();
			break;
		case "Str & Cha":
			this.str = this.str + (raceType.getRaceAsi() * 2);
			this.cha = this.cha + raceType.getRaceAsi();
			break;
		case "Str & Con":
			this.str = this.str + (raceType.getRaceAsi() * 2);
			this.con = this.con + raceType.getRaceAsi();
			break;
		case "Inte & Cha":
			this.inte = this.inte + raceType.getRaceAsi();
			this.cha = this.cha + (raceType.getRaceAsi() * 2);
			break;
		case "Two Of Choice":
			Scanner input = new Scanner(System.in);
			this.cha = this.cha + (raceType.getRaceAsi() * 2);

			for (int i = 0; i < 2; i++) {
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Choose Two buffs");
				System.out.println("1.con");
				System.out.println("2.dex");
				System.out.println("3.Str");
				System.out.println("4.Wis");
				System.out.println("5.Inte");
				System.out.println("6.Cha");
				System.out.print(" >> ");

				int ans = input.nextInt();
				if ((ans >= 1) && (ans <= 6)) {
					switch (ans) {
					case 1:
						this.con = this.con + 1;
						break;
					case 2:
						this.dex = this.dex + 1;
						break;
					case 3:
						this.str = this.str + 1;
						break;
					case 4:
						this.wis = this.wis + 1;
						break;
					case 5:
						this.inte = this.inte + 1;
						break;
					case 6:
						this.cha = this.cha + 1;
						break;
					}
				} else {
					System.out
							.println("You needed to put something else but you didnt and here we are... at the end...");
					System.exit(0);
				}
			}

			input.close();

		}
	}

	public void setName(String val) {
		this.name = val;
	}

	public void setDiceOfWeapon(String newdice) {
		this.diceOfWeapon = newdice;
	}

	public String getdiceOfWeapon() {
		return diceOfWeapon;
	}

	public String getName() {
		return name;
	}

	public String getRace() {
		return race;
	}

	public void printInfo() {
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: "
				+ wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + charClass + "  |  Hit point dice: " + diceOfCharacter + "  |  Prefered Weapon: "
				+ weaponOfChoice);

	}

	public void printInfoWithRace() {
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: "
				+ wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
		System.out.println("Class: " + charClass + "  |  Race:  " + race + "  |  Hit point dice: " + diceOfCharacter
				+ "  |  Prefered Weapon: " + weaponOfChoice);

	}
}
