package projectCreation;

import java.util.Scanner;

public class motherFile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		characterMain characterObj = new characterMain();

		System.out.println("Would you like a random character, or would you like to build it your self?");
		System.out.println("1. Random");
		System.out.println("2. Build it yourself");
		System.out.print(">>");
		int ans = input.nextInt();

		

		if (ans == 1) {
			makeBarrier();
			characterObj.setClass(setCharacterClass.createCharacterClass(setCharacterClass.getDex(),
					setCharacterClass.getCon(), setCharacterClass.getStr(), setCharacterClass.getWis(),
					setCharacterClass.getInte(), setCharacterClass.getCha()));
			characterObj.printInfo();
		} else {
			makeBarrier();

		}
		input.close();
	}

	public static void makeBarrier() {
		System.out.println("--------------------------------------------------------------------------------------");
	}
}
