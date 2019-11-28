package projectCreation;

import java.util.Scanner;

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
		int ans = input.nextInt();

		if (checkIfValid(ans, 1, 2) == false) {
			failureA();
		}

		if (ans == 1) {
			makeBarrier();

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
			makeBarrier();

			System.out.println("Inter numbers from 3 to 18.");
			System.out.print("Dex >> ");

			int num = input.nextInt();
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
		input.close();
	}

	public static void makeBarrier() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");
	}

	public static boolean checkIfValid(int num, int minNum, int maxNum) {

		if ((num >= minNum) && (num <= maxNum)) {
			return true;
		} else {
			return false;
		}

	}

	public static void failureA() {
		System.out.println("Please enter 1 or 2 next time.");
		System.exit(0);
	}

	public static void failureB() {
		System.out.println("Your number wasnt in the 3-18 min/max paramaters.");
		System.exit(0);
	}

	public static int getRandomNum(int min, int max) {
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}
}
