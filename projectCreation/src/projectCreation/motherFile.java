package projectCreation;


public class motherFile {
	public static void main(String[] args) {
		
		characterMain characterObj = new characterMain();
		
		characterObj.setClass(setCharacterClass.createCharacterClass(setCharacterClass.getDex(), setCharacterClass.getCon(), setCharacterClass.getStr(), setCharacterClass.getWis(), setCharacterClass.getInte(), setCharacterClass.getCha()));
		
		characterObj.printInfo();
		
	}
}
