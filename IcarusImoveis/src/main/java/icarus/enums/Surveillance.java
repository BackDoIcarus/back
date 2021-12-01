package icarus.enums;

public enum Surveillance {

	SIM("Sim"),
	NAO("Nao");
	
	private String surveillance;
	
	private Surveillance(String surveillance) {
		this.surveillance = surveillance;
	}
}
