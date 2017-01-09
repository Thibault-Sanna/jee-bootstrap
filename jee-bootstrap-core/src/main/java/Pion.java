
public class Pion {
	
	public Pion(Boolean isDame, String colour) {
		super();
		this.isDame = isDame;
		Colour = colour;
	}
	private Boolean isDame;
	private String Colour;
	//private position;  à implémenter en fonction du tableau
	
	public Boolean getIsDame() {
		return isDame;
	}
	public void setIsDame(Boolean isDame) {
		this.isDame = isDame;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	
}
