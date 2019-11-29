package projectCreation;

import java.util.Scanner;
import projectCreation.Races.*;

public class motherFile {
	public static void main(String[] args) {

		int minNum = 3;
		int maxNum = 18;

		Scanner input = new Scanner(System.in);
		characterMain characterObj = new characterMain();

		System.out.println("Would you like a random character, or would you like to build it your self?");
		System.out.println("1. Random");
		System.out.println("2. Build it yourself");
		System.out.print(" >> ");
		int num = input.nextInt();

		if (checkIfValid(num, 1, 2) == false) {
			failureA();
		}
		makeBarrier();
		if (num == 1) {

			setCharacterClass.setDex(getRandomNum(minNum, maxNum));

			setCharacterClass.setCon(getRandomNum(minNum, maxNum));

			setCharacterClass.setStr(getRandomNum(minNum, maxNum));

			setCharacterClass.setWis(getRandomNum(minNum, maxNum));

			setCharacterClass.setInte(getRandomNum(minNum, maxNum));

			setCharacterClass.setCha(getRandomNum(minNum, maxNum));

			characterObj.setClass(setCharacterClass.createCharacterClass(setCharacterClass.getDex(),
					setCharacterClass.getCon(), setCharacterClass.getStr(), setCharacterClass.getWis(),
					setCharacterClass.getInte(), setCharacterClass.getCha()));
			characterObj.printInfo();
		} else {

			System.out.println("Inter numbers from 3 to 18.");
			System.out.print("Dex >> ");

			num = input.nextInt();
			if (checkIfValid(num, minNum, maxNum) == true) {
				setCharacterClass.setDex(num);
			} else {
				input.close();
				failureB();
			}

			System.out.print("Con >> ");

			num = input.nextInt();
			if (checkIfValid(num, minNum, maxNum) == true) {
				setCharacterClass.setCon(num);
			} else {
				input.close();
				failureB();
			}

			System.out.print("Str >> ");

			num = input.nextInt();
			if (checkIfValid(num, minNum, maxNum) == true) {
				setCharacterClass.setStr(num);
			} else {
				input.close();
				failureB();
			}

			System.out.print("Wis >> ");

			num = input.nextInt();
			if (checkIfValid(num, minNum, maxNum) == true) {
				setCharacterClass.setWis(num);
			} else {
				input.close();
				failureB();
			}

			System.out.print("Inte >> ");

			num = input.nextInt();
			if (checkIfValid(num, minNum, maxNum) == true) {
				setCharacterClass.setInte(num);
			} else {
				input.close();
				failureB();
			}

			System.out.print("Cha >> ");

			num = input.nextInt();
			if (checkIfValid(num, minNum, maxNum) == true) {
				setCharacterClass.setCha(num);
			} else {
				input.close();
				failureB();
			}

			characterObj.setClass(setCharacterClass.createCharacterClass(setCharacterClass.getDex(),
					setCharacterClass.getCon(), setCharacterClass.getStr(), setCharacterClass.getWis(),
					setCharacterClass.getInte(), setCharacterClass.getCha()));
			characterObj.printInfo();

		}

		makeBarrier();
		System.out.println("Would you like a random race or would you like to choose your own?");
		System.out.println("1. Random");
		System.out.println("2. Choose");
		System.out.print(" >> ");
		num = input.nextInt();

		if (checkIfValid(num, 1, 2) == false) {
			failureA();
		}
		makeBarrier();
		if (num == 1) {
			num = getRandomNum(1, 9);
			switch (num) {
			case 1:
				characterObj.setRace(new dwarfRace());
				break;
			case 2:
				characterObj.setRace(new elfRace());
				break;
			case 3:
				characterObj.setRace(new halflingRace());
				break;
			case 4:
				characterObj.setRace(new humanRace());
				break;
			case 5:
				characterObj.setRace(new dragonbornRace());
				break;
			case 6:
				characterObj.setRace(new gnomeRace());
				break;
			case 7:
				characterObj.setRace(new halfElfRace());
				break;
			case 8:
				characterObj.setRace(new halfOrcRace());
				break;
			case 9:
				characterObj.setRace(new tieflringRace());
				break;
			}
		} else {
			System.out.println("Choose a race:");
			System.out.println("1. Dwarf");
			System.out.println("2. Elf");
			System.out.println("3. Halfling");
			System.out.println("4. Human");
			System.out.println("5. Dragonborn");
			System.out.println("6. Gnome");
			System.out.println("7. Half-Elf");
			System.out.println("8. Half-Orc");
			System.out.println("9. Tieflring");
			System.out.print(" >> ");
			num = input.nextInt();

			switch (num) {
			case 1:
				characterObj.setRace(new dwarfRace());
				break;
			case 2:
				characterObj.setRace(new elfRace());
				break;
			case 3:
				characterObj.setRace(new halflingRace());
				break;
			case 4:
				characterObj.setRace(new humanRace());
				break;
			case 5:
				characterObj.setRace(new dragonbornRace());
				break;
			case 6:
				characterObj.setRace(new gnomeRace());
				break;
			case 7:
				characterObj.setRace(new halfElfRace());
				break;
			case 8:
				characterObj.setRace(new halfOrcRace());
				break;
			case 9:
				characterObj.setRace(new tieflringRace());
				break;
			default:
				System.out.println("That was an incorrect input your death will commence in 5... 4... 3...");
			}

		}
		makeBarrier();
		characterObj.printInfoWithRace();
		makeBarrier();
		
		characterObj.setSubRace();
		makeBarrier();
		characterObj.printInfoWithSubRace();
		makeBarrier();

		input.close();
	}

	private static void makeBarrier() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");
	}

	private static boolean checkIfValid(int num, int minNum, int maxNum) {

		if ((num >= minNum) && (num <= maxNum)) {
			return true;
		} else {
			return false;
		}

	}

	private static void failureA() {
		System.out.println("Please enter 1 or 2 next time.");
		System.exit(0);
	}

	private static void failureB() {
		System.out.println("Your number wasnt in the 3-18 min/max paramaters.");
		System.exit(0);
	}

	private static int getRandomNum(int min, int max) {
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}
}
