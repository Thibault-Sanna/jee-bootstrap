
public class Pion {
	
	public Pion(Boolean isDame, String colour) {
		super();
		this.isDame = isDame;
		Colour = colour;
	}
	private Boolean isDame;
	private String Colour;
	private int numeroLigne;
	private int numeroColonne;
	
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
	public int setNumeroLigne(int numeroLigne) {
		this.numeroLigne= numeroLigne;
	}
	public int setNumeroColonne(int numeroColonne) {
		this.numeroLigne= numeroColonne;
	}
	
	public void deplacerPion(int deplacementColonne,int deplacementLigne){
		if(this.isDame && Math.abs(deplacementColonne)==Math.abs(deplacementLigne) ){
			this.numeroColonne += deplacementColonne;
			this.numeroLigne += deplacementLigne;
		}
		else if(Math.abs(deplacementColonne)==1 && Math.abs(deplacementLigne)==1){
			this.numeroColonne += deplacementColonne;
			this.numeroLigne += deplacementLigne;
			if(this.Colour=="Blanc" && this.numeroLigne == 0 ){
				this.isDame = true ;
			}
			else if (this.Colour == "Noir" && this.numeroLigne == 9){
				this.isDame = true;
			}
		}
		else {
			System.out.println("Coup invalide");
		}
		
	}
	
	
}
