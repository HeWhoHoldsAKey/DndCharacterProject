package projectCreation;

public class characterRace {
	private String raceDescription;
	private String race;
	private String subRace;
	private String raceAsiType;
	private String subRaceAsiType;

	private int raceAsi;
	private int subRaceAsi;

	public String getRaceDescription() {
		return raceDescription;
	}

	public void getRaceDescription(String val) {
		this.raceDescription = val;
	}

	public void setRace(String val) {
		this.race = val;
	}

	public void setSubRace(String val) {
		this.subRace = val;
	}

	public void setRaceAsiType(String val) {
		this.raceAsiType = val;
	}

	public void setSubRaceAsiType(String val) {
		this.subRaceAsiType = val;
	}

	public void setRaceAsi(int val) {
		this.raceAsi = val;
	}

	public void setSubRaceAsi(int val) {
		this.subRaceAsi = val;
	}

	public int getRaceAsi() {
		return raceAsi;
	}

	public int getSubRaceAsi() {
		return subRaceAsi;
	}

	public String getRace() {
		return race;
	}

	public String getSubRace() {
		return subRace;
	}

	public String getRaceAsiType() {
		return raceAsiType;
	}

	public String getSubRaceAsiType() {
		return subRaceAsiType;
	}
}
