package projectCreation;

public class motherFile {
	public static void main(String[] args) {
		
		characterClass characterObj = null;
		
		characterObj = makeCharacter.createCharacter(makeStats.getDex(), makeStats.getCon(), makeStats.getStr(), makeStats.getWis(), makeStats.getInte(), makeStats.getCon());
		
		characterObj.printInfo();
	}
}
