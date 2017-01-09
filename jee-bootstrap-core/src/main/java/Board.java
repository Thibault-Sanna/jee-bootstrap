import java.util.ArrayList;

public class Board {
	
	private int nombreColonnes;
	private int nombreLignes;
	private ArrayList<Case> board = new ArrayList();

   
	
	public Board(int nombreColonnes, int nombreLignes) {
		super();
		this.nombreColonnes = nombreColonnes;
		this.nombreLignes = nombreLignes;
		for(int i=0;i<nombreColonnes;i++){
			for(int j=0;j<nombreLignes;j++){
				String couleur = new String();
				if((i+j)%2==0){couleur = Colour.BLANC.toString() ; }
				else{couleur = Colour.NOIR.toString();}
				Case caseAjout = new Case(j,i, couleur);
				board.add(caseAjout);
			}
		}
	}
	public int getNombreColonnes() {
		return nombreColonnes;
	}
	public void setNombreColonnes(int nombreColonnes) {
		this.nombreColonnes = nombreColonnes;
	}
	public int getNombreLignes() {
		return nombreLignes;
	}
	public void setNombreLignes(int nombreLignes) {
		this.nombreLignes = nombreLignes;
	}
	
}
