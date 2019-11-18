package projectCreation;

import java.util.Random;

public class makeStats {

	static int minNum = 3;
	static int maxNum = 18;

	static int dex = getRandomNum(minNum, maxNum);
	static int con = getRandomNum(minNum, maxNum);
	static int str = getRandomNum(minNum, maxNum);
	static int wis = getRandomNum(minNum, maxNum);
	static int inte = getRandomNum(minNum, maxNum);
	static int cha = getRandomNum(minNum, maxNum);
	static int armorStuff = getRandomNum(1, 2);

	public static int getDex() {
		return dex;
	}

	public static int getCon() {
		return con;
	}

	public static int getStr() {
		return str;
	}

	public static int getWis() {
		return wis;
	}

	public static int getInte() {
		return inte;
	}

	public static int getCha() {
		return cha;
	}
	
	public static int getArmorStuff(){
		return armorStuff;
	}

	public static int getRandomNum(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}

}
