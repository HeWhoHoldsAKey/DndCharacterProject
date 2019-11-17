package projectCreation;

public class motherFile {
	public static void main(String[] args) {
		
		characterMain characterObj = null;
		
		characterObj = setCharacterClass.createCharacterClass(makeStats.getDex(), makeStats.getCon(), makeStats.getStr(), makeStats.getWis(), makeStats.getInte(), makeStats.getCha());
		characterObj.printInfo();
	}
}
