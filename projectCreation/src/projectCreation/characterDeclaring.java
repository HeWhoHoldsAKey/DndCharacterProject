package projectCreation;

import java.util.*;
public class characterDeclaring {

	public static void main(String[] args) {
		//a-dex , b-con, c-str, d-wis, e-int, f-cha
        
		int minNum = 3;
		int maxNum = 18;
		
		
		int dex = getRandomNum(minNum, maxNum);
		int con = getRandomNum(minNum, maxNum);
		int str = getRandomNum(minNum, maxNum);
		int wis = getRandomNum(minNum, maxNum);
		int inte = getRandomNum(minNum, maxNum);
		int cha = getRandomNum(minNum, maxNum);
		        
		
		String myClassName = getCharacter(dex, con, str, wis, inte, cha);
		
		System.out.println("Dexterity: " + dex + "  |  Constitution: " + con + "  |  Strength: " + str + "  |  Wisdom: " + wis + "  |  Intelligence: " + inte + "  |  Charisma: " + cha);
        System.out.println("Class: " + myClassName + "  |  Dice: " + characterObj.getDieReq());
	}
	
	
	//Makes a random number
	public static int getRandomNum(int A, int B) {
		Random rand = new Random();
        return rand.nextInt((B - A) + 1) + A;
	}
	
	
	//By 2 layer nested if statements we find the character...
	public static String getCharacter(int a, int b, int c, int d, int e, int f) {
		String classDecided = "";
		if (a >= 15){

            //rogue, monk
            if (e > b){
            	classDecided = "Rogue";
            	//classDecided[1] = "D8";
            }
            else{
            	classDecided = "Monk";
            	//classDecided[1] = "D8";
            }

        }

        else if (c >= 15){
            //barb
        	classDecided = "Barbarian";
        	//classDecided[1] = "D12";
        }
        else if (d >= 15){
            //druid, ranger dex, cleric con
            if ((d + a) >= 25){
            	classDecided = "Ranger";
            	//classDecided[1] = "D10";
            }
            else if ((d + b) >= 25){
            	classDecided = "Cleric";
            	//classDecided[1] = "D8";
            }
            else{
            	classDecided = "Druid";
            	//classDecided[1] = "D8";
            }
        }
        else if (e >= 15){
            //wizard
        	classDecided = "Wizard";
        	//classDecided[1] = "D6";
        }
        else if (f >= 15){
            //bard dex, sorcerer, warlock wis, paladin con
            if ((f+a) >= 25){
            	classDecided = "Bard";
            	//classDecided[1] = "D8";
            }
            else if ((f+d) >= 25){
            	classDecided = "Warlock";
            	//classDecided[1] = "D8";
            }
                else if ((f+b) >= 25){
                	classDecided = "Paladin";
                	//classDecided[1] = "D10";
            }
            else {
            	classDecided = "Sorcerer";
            	//classDecided[1] = "D6";
            }
        }
        else {
            //fighter
        	classDecided = "Fighter";
        	//classDecided[1] = "D10";
        }

		return classDecided;
	}

	//character classes :')
	//gonna use rogue as our example puppet...
	public class DNDmother {
		private String dieReq = "D8";
		public String getDieReq() {
			return dieReq;
		}
	}
	
	public class Rogue extends DNDmother{
		
	}
	public class Cleric extends DNDmother{
		
	}
	public class Druid extends DNDmother{
		
	}
	public class Wizard extends DNDmother{
		
	}
	public class Bard extends DNDmother{
		
	}
	public class Warlock extends DNDmother{
		
	}
	public class Paladin extends DNDmother{
		
	}
	public class Sorcerer extends DNDmother{
		
	}
	public class Fighter extends DNDmother{
		
	}

	
	
}
